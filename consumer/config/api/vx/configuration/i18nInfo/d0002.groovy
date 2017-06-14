package api.vx.configuration.i18nInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.I18nInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def i18nInfoIds = input?.i18nInfoIds?.split(",")

        if (!i18nInfoIds) {
            throw new CodeException("i18nInfoIds required", "国际化信息标识集合必填")
        }

        def i18nInfoIdList = []

        for (def i18nInfoId : i18nInfoIds) {
            i18nInfoIdList.add(["i18nInfoId": i18nInfoId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["i18nInfoIds": i18nInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(I18nInfoService.class).deleteListCache(input?.i18nInfoIds)]
    }

    def output(output) {
        output
    }
}