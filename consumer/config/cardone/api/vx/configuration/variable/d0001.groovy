package top.cardone.api.vx.configuration.variable

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.VariableService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def variableIds = input?.variableIds?.split(",")

        if (!variableIds) {
            throw new CodeException("variableIds required", "变量标识集合必填")
        }

        def variableIdList = []

        for (def variableId : variableIds) {
            variableIdList.add(["variableId": variableId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["variableIds": variableIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(VariableService.class).updateListCache(input?.variableIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}