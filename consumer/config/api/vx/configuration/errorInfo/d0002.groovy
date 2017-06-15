package top.cardone.api.vx.configuration.errorInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.ErrorInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def errorInfoIds = input?.errorInfoIds?.split(",")

        if (!errorInfoIds) {
            throw new CodeException("errorInfoIds required", "错误信息标识集合必填")
        }

        def errorInfoIdList = []

        for (def errorInfoId : errorInfoIds) {
            errorInfoIdList.add(["errorInfoId": errorInfoId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["errorInfoIds": errorInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(ErrorInfoService.class).updateListCache(input?.errorInfoIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}