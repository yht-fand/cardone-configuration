package top.cardone.api.vx.configuration.dictionary

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0003 implements java.io.Serializable {
    def input(input) {
        def dictionaryIds = input?.dictionaryIds?.split(",")

        if (!dictionaryIds) {
            throw new CodeException("dictionaryIds required", "字典标识集合必填")
        }

        def dictionaryIdList = []

        for (def dictionaryId : dictionaryIds) {
            dictionaryIdList.add(["dictionaryId": dictionaryId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["dictionaryIds": dictionaryIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ApplicationContextHolder.getBean(DictionaryService.class).updateListCache(input?.dictionaryIds)
    }

    def output(output) {
        ['deleteCounts': output]
    }
}