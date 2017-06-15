package top.cardone.api.vx.configuration.systemInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SystemInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def systemInfoIds = input?.systemInfoIds?.split(",")

        if (!systemInfoIds) {
            throw new CodeException("systemInfoIds required", "系统信息标识集合必填")
        }

        def systemInfoIdList = []

        for (def systemInfoId : systemInfoIds) {
            systemInfoIdList.add(["systemInfoId": systemInfoId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["systemInfoIds": systemInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(SystemInfoService.class).updateListCache(input?.systemInfoIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}