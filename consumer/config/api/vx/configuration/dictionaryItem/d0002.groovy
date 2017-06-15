package api.vx.configuration.dictionaryItem

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryItemService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class d0001 implements java.io.Serializable {
    def input(input) {
        def dictionaryItemIds = input?.dictionaryItemIds?.split(",")

        if (!dictionaryItemIds) {
            throw new CodeException("dictionaryItemIds required", "字典项标识集合必填")
        }

        def dictionaryItemIdList = []

        for (def dictionaryItemId : dictionaryItemIds) {
            dictionaryItemIdList.add(["dictionaryItemId": dictionaryItemId, "flagCode": "input", "dataStateCode": "0", "endDate": new Date()])
        }

        ["dictionaryItemIds": dictionaryItemIdList]
    }

    def validation(input) {
    }

    def func(input) {
        ['deleteCounts': ApplicationContextHolder.getBean(DictionaryItemService.class).deleteListCache(input?.dictionaryItemIds)]
    }

    def output(output) {
        output
    }
}