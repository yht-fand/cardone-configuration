package top.cardone.configuration.i18nInfo.action

import com.google.common.base.Charsets
import com.google.gson.Gson
import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils
import org.springframework.core.io.Resource
import top.cardone.configuration.service.DictionaryService
import top.cardone.configuration.service.I18nInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.action.Action0

import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes
import java.util.regex.Pattern

class GenerateFileAction implements Action0 {
    Resource jsonFile

    String webRoot

    Pattern matche = Pattern.compile("[^0-9a-zA-Z]")

    @Override
    void action() {
        Resource defaultGenerateJsonFile = ApplicationContextHolder.applicationContext.getResource("${webRoot}/language.json")

        if (!defaultGenerateJsonFile.exists()) {
            this.generateFile(defaultGenerateJsonFile)

            return
        }

        long defaultGenerateJsonFileLastModifiedTime = Files.readAttributes(defaultGenerateJsonFile.file.toPath(),
                BasicFileAttributes.class).lastModifiedTime().toMillis()

        if (jsonFile && jsonFile.exists()) {
            BasicFileAttributes basicFileAttributes = Files.readAttributes(jsonFile.file.toPath(), BasicFileAttributes.class)

            if (basicFileAttributes.lastModifiedTime().toMillis() > defaultGenerateJsonFileLastModifiedTime) {
                this.generateFile(defaultGenerateJsonFile)

                return
            }
        }

        Date dbLastModifyDate = ApplicationContextHolder.getBean(I18nInfoService.class).
                readOneByFuncIdCache(Date.class, "top/cardone/configuration/func/ReadOneMaxChangeDateFunc", null)

        if (dbLastModifyDate.getTime() > defaultGenerateJsonFileLastModifiedTime) {
            this.generateFile(defaultGenerateJsonFile)
        }
    }

    void generateFile(Resource defaultGenerateJsonFile) {
        def languages = ApplicationContextHolder.getBean(DictionaryService.class).readListCache([
                dictionaryTypeCode: "i18nInfoType",
                object_id         : "dictionaryCode"
        ])

        def defaultLanguage = ApplicationContextHolder.getBean(DictionaryService.class).readOneValueByCodeCache(
                "sys", "language", "zh_CN")

        def staticMap = null

        if (jsonFile && jsonFile.exists()) {
            staticMap = ApplicationContextHolder.getBean(Gson.class).fromJson(jsonFile.file.text, Map.class)
        }

        def insertMapList = []

        for (def language : languages) {
            def i18nMapList = ApplicationContextHolder.getBean(I18nInfoService.class).findListCache([
                    "typeCode": "page",
                    "language": language
            ])

            def map = [:]

            for (def i18nMap : i18nMapList) {
                def key = "i18n_" + matche.matcher(i18nMap.i18n_info_code).replaceAll("_")

                map.put(key, i18nMap.content)
            }

            if (!staticMap) {
                this.generateFile(defaultGenerateJsonFile, map, language, defaultLanguage)

                continue
            }

            staticMap.each {
                if (map.containsKey(it.key)) {
                    return
                }

                map.put(it.key, it.value)

                def i18nInfoCode = StringUtils.substring(it.key, "i18n_".length())

                insertMapList.add([
                        "i18nInfoCode": i18nInfoCode,
                        "content"     : it.value,
                        "typeCode"    : "page",
                        "language"    : language
                ])
            }

            this.generateFile(defaultGenerateJsonFile, map, language, defaultLanguage)
        }

        if (insertMapList) {
            ApplicationContextHolder.getBean(I18nInfoService.class).insertListByNotExistsCache(insertMapList)
        }
    }

    void generateFile(Resource defaultGenerateJsonFile, Map map, String language, String defaultLanguage) {
        String jsonString = ApplicationContextHolder.getBean(Gson.class).toJson(map)

        def generateJsonFile = ApplicationContextHolder.applicationContext.getResource(
                "${webRoot}/language_${language}.json")

        FileUtils.writeStringToFile(generateJsonFile.file, jsonString, Charsets.UTF_8)

        if (language.equals(defaultLanguage)) {
            FileUtils.copyFile(generateJsonFile.file, defaultGenerateJsonFile.file)
        }
    }
}