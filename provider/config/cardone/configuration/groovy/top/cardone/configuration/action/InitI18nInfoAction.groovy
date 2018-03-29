package top.cardone.configuration.action

import com.google.common.collect.Lists
import org.apache.commons.lang3.StringUtils
import top.cardone.context.ApplicationContextHolder
import top.cardone.context.util.MapUtils
import top.cardone.core.util.action.Action1
import top.cardone.data.service.CrudService

/**
 * @author cardo on 2018/1/24 0024.
 */
class InitI18nInfoAction implements Action1<List<Map<String, Object>>> {
    def i18nInfoCodeKeys = []

    def languages = ["zh_CN", "en"]

    def contentKey = "name"

    def typeCode = "data"

    def beanName = "top.cardone.configuration.service.I18nInfoService"

    @Override
    void action(List<Map<String, Object>> maps) {
        def newMaps = []

        for (def map : maps) {
            String i18nInfoCode = StringUtils.EMPTY

            for (String i18nInfoCodeKey : i18nInfoCodeKeys) {
                if (StringUtils.isNotBlank(i18nInfoCode)) {
                    i18nInfoCode += ","
                }

                i18nInfoCode += MapUtils.getString(map, i18nInfoCodeKey)
            }

            for (String language : languages) {
                newMaps.add(["i18nInfoCode": i18nInfoCode,
                             "language"    : language,
                             "content"     : MapUtils.getString(map, contentKey),
                             "typeCode"    : typeCode])
            }
        }

        ApplicationContextHolder.getBean(CrudService.class, beanName).insertListByNotExists(Lists.newArrayList(newMaps))
    }
}