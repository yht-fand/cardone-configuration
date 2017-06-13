package api.vx.configuration.site

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SiteService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def siteIds = input?.siteIds?.split(",")

        if (!siteIds) {
            throw new CodeException("siteIds required", "站点标识集合必填")
        }

        def siteIdList = []

        for (def siteId : siteIds) {
            siteIdList.add(["siteId": siteId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["siteIds": siteIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(SiteService.class).deleteListCache(input?.siteIds)]
    }

    def output(output) {
        output
    }
}