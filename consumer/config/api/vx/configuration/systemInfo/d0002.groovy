package api.vx.configuration.systemInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SystemInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def systemInfoIds = input?.systemInfoIds?.split(",")

        if (!systemInfoIds) {
            throw new CodeException("systemInfoIds required", "系统信息标识集合必填")
        }

        def systemInfoIdList = []

        for (def systemInfoId : systemInfoIds) {
            systemInfoIdList.add(["systemInfoId": systemInfoId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["systemInfoIds": systemInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(SystemInfoService.class).deleteListCache(input?.systemInfoIds)]
    }

    def output(output) {
        output
    }
}