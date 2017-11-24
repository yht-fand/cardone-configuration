package top.cardone.api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0003 implements java.io.Serializable {
    def input(input) {
        def navigationIds = input?.navigationIds?.split(",")

        if (!navigationIds) {
            throw new CodeException("navigationIds required", "导航标识集合必填")
        }

        def navigationIdList = []

        for (def navigationId : navigationIds) {
            navigationIdList.add(["navigationId": navigationId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["navigationIds": navigationIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(NavigationService.class).updateListCache(input?.navigationIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}