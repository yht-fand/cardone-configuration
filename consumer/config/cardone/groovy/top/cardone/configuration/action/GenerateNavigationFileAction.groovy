package top.cardone.configuration.action

import com.google.common.base.Charsets
import com.google.gson.Gson
import org.apache.commons.io.FileUtils
import org.apache.commons.lang3.StringUtils
import org.springframework.core.io.Resource
import top.cardone.configuration.service.DictionaryService
import top.cardone.configuration.service.I18nInfoService
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.action.Action0

class GenerateNavigationFileAction implements Action0 {
    String webRoot

    @Override
    void action() {
        Resource navigationFile = ApplicationContextHolder.applicationContext.getResource("${webRoot}/navigation.json")

        if (!navigationFile.exists()) {
            this.generateFile(navigationFile, null)

            return
        }

        Date dbLastModifyDate = ApplicationContextHolder.getBean(NavigationService.class).
                readOneByFuncIdCache(Date.class, "top/cardone/configuration/i18nInfo/func/ReadOneMaxChangeDateFunc", null)

        if (dbLastModifyDate.getTime() > defaultGenerateJsonFileLastModifiedTime) {
            this.generateFile(navigationFile, null)
        }
    }

    void generateFile(Resource defaultGenerateJsonFile, Map staticMap) {
        def languages = ApplicationContextHolder.getBean(DictionaryService.class).readListCache([
                dictionaryTypeCode: "i18nInfoType",
                object_id         : "dictionaryCode"
        ])

        def defaultLanguage = ApplicationContextHolder.getBean(DictionaryService.class).readOneValueByCodeCache(
                "sys", "language", "zh_CN")

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
                if (!StringUtils.startsWithAny(it.key, "i18n_")) {
                    return
                }

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