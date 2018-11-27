package top.cardone.api.vx.configuration.site

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SiteService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0003 implements java.io.Serializable {
    def input(input) {
        def siteIds = input?.siteIds?.split(",")

        if (!siteIds) {
            throw new CodeException("siteIds required", "站点标识集合必填")
        }

        def siteIdList = []

        for (def siteId : siteIds) {
            siteIdList.add(["siteId": siteId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["siteIds": siteIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(SiteService.class).updateListCache(input?.siteIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}