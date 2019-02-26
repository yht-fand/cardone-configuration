package top.cardone.configuration.action

import com.google.common.base.Charsets
import com.google.gson.Gson
import org.apache.commons.io.FileUtils
import org.springframework.core.io.Resource
import top.cardone.cache.Cache
import top.cardone.configuration.service.DictionaryService
import top.cardone.configuration.service.I18nInfoService
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.util.action.Action0

import java.nio.file.Files
import java.nio.file.attribute.BasicFileAttributes

class GenerateNavigationFileAction implements Action0 {
    String webRoot

    @Override
    void action() {
        Resource defaultGenerateJsonFile = ApplicationContextHolder.applicationContext.getResource("${webRoot}/navigation.json")

        if (!defaultGenerateJsonFile.exists()) {
            this.generateFile(defaultGenerateJsonFile)

            return
        }

        long defaultGenerateJsonFileLastModifiedTime = Files.readAttributes(defaultGenerateJsonFile.file.toPath(),
                BasicFileAttributes.class).lastModifiedTime().toMillis()

        Date dbLastModifyDate = ApplicationContextHolder.getBean(NavigationService.class).
                readOneByFuncIdCache(Date.class, "top/cardone/configuration/navigation/func/ReadOneMaxChangeDateFunc", null)

        if (dbLastModifyDate.getTime() > defaultGenerateJsonFileLastModifiedTime) {
            this.generateFile(defaultGenerateJsonFile)
        }
    }

    void generateFile(Resource defaultGenerateJsonFile) {
        def navigationList = ApplicationContextHolder.getBean(NavigationService.class).findListByFuncIdCache(
                "top/cardone/configuration/navigation/func/FindListFunc", null
        )

        if (!navigationList) {
            return
        }

        def languages = ApplicationContextHolder.getBean(DictionaryService.class).readListCache([
                dictionaryTypeCode: "i18nInfoType",
                object_id         : "dictionaryCode"
        ])

        if (!languages) {
            return
        }

        def defaultLanguage = top.cardone.configuration.utils.DictionaryUtils.readOneValueByCodeCache(
                "sys", "language", "zh_CN")

        for (def language : languages) {
            def i18nMapList = ApplicationContextHolder.getBean(I18nInfoService.class).findListCache([
                    "typeCode": "navigation",
                    "language": language
            ])

            def map = [:]

            def newNavigationList = []

            try {
                for (def i18nMap : i18nMapList) {
                    map.put(i18nMap.i18n_info_code, i18nMap.content)
                }

                navigationList.each {
                    def name = map.get(it.navigation_code, it.name)

                    newNavigationList.add([
                            navigation_id  : it.navigation_id,
                            navigation_code: it.navigation_code,
                            name           : name,
                            parent_id      : it.parent_id,
                            parent_code    : it.parent_code,
                            url            : it.url,
                            icon_style     : it.icon_style
                    ])
                }

                this.generateFile(defaultGenerateJsonFile, newNavigationList, language, defaultLanguage)
            } finally {
                if (map) {
                    map.clear()
                    map = null
                }

                if (newNavigationList) {
                    newNavigationList.clear()
                    newNavigationList = null
                }
            }
        }
    }

    void generateFile(Resource defaultGenerateJsonFile, List navigationList, String language, String defaultLanguage) {
        String jsonString = ApplicationContextHolder.getBean(Gson.class).toJson(navigationList)

        def generateJsonFile = ApplicationContextHolder.applicationContext.getResource(
                "${webRoot}/navigation_${language}.json")

        FileUtils.writeStringToFile(generateJsonFile.file, jsonString, Charsets.UTF_8)

        ApplicationContextHolder.getBean(Cache.class, "cardone.bean.cache").evict(
                "navigation",
                1,
                generateJsonFile.getURL())

        jsonString = null

        if (language.equals(defaultLanguage)) {
            FileUtils.copyFile(generateJsonFile.file, defaultGenerateJsonFile.file)

            ApplicationContextHolder.getBean(Cache.class, "cardone.bean.cache").evict(
                    "navigation",
                    1,
                    defaultGenerateJsonFile.getURL())
        }
    }
}