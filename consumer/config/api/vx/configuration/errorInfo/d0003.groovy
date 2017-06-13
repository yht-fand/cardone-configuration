package api.vx.configuration.errorInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.ErrorInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 {
    def input(input) {
        def errorInfoIds = input?.errorInfoIds?.split(",")

        if (!errorInfoIds) {
            throw new CodeException("errorInfoIds required", "错误信息标识集合必填")
        }

        def errorInfoIdList = []

        for (def errorInfoId : errorInfoIds) {
            errorInfoIdList.add(["errorInfoId": errorInfoId, "dataStateCode": "0", "endDate": new Date()])
        }

        ["errorInfoIds": errorInfoIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['data': ApplicationContextHolder.getBean(ErrorInfoService.class).updateListCache(input?.errorInfoIds)]
    }

    def output(output) {
        output
    }
}