package top.cardone.api.vx.configuration.dictionaryType

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryTypeService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def dictionaryTypeIds = input?.dictionaryTypeIds?.split(",")

        if (!dictionaryTypeIds) {
            throw new CodeException("dictionaryTypeIds required", "字典类别标识集合必填")
        }

        def dictionaryTypeIdList = []

        for (def dictionaryTypeId : dictionaryTypeIds) {
            dictionaryTypeIdList.add(["dictionaryTypeId": dictionaryTypeId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["dictionaryTypeIds": dictionaryTypeIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(DictionaryTypeService.class).updateListCache(input?.dictionaryTypeIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}