package top.cardone.api.vx.configuration.dictionaryItem

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryItemService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["dictionaryItemId": input.dictionaryItemId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryItemId)) {
//          throw new CodeException("dictionaryItemId required", "字典项标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryItemService.class).findOneByDictionaryItemId(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
		newOutput?.createdByCode = output?.CREATED_BY_CODE
		newOutput?.createdById = output?.CREATED_BY_ID
		newOutput?.createdDate = output?.CREATED_DATE
		newOutput?.dataStateCode = output?.DATA_STATE_CODE
		newOutput?.departmentCode = output?.DEPARTMENT_CODE
		newOutput?.dictionaryCode = output?.DICTIONARY_CODE
		newOutput?.dictionaryId = output?.DICTIONARY_ID
		newOutput?.dictionaryItemCode = output?.DICTIONARY_ITEM_CODE
		newOutput?.dictionaryItemId = output?.DICTIONARY_ITEM_ID
		newOutput?.dictionaryTypeCode = output?.DICTIONARY_TYPE_CODE
		newOutput?.dictionaryTypeId = output?.DICTIONARY_TYPE_ID
		newOutput?.endDate = output?.END_DATE
		newOutput?.explain = output?.EXPLAIN_
		newOutput?.flagCode = output?.FLAG_CODE
		newOutput?.flagObjectCode = output?.FLAG_OBJECT_CODE
		newOutput?.jsonData = output?.JSON_DATA
		newOutput?.lastModifiedByCode = output?.LAST_MODIFIED_BY_CODE
		newOutput?.lastModifiedById = output?.LAST_MODIFIED_BY_ID
		newOutput?.lastModifiedDate = output?.LAST_MODIFIED_DATE
		newOutput?.name = output?.NAME
		newOutput?.orderBy = output?.ORDER_BY_
		newOutput?.orgCode = output?.ORG_CODE
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.remark = output?.REMARK
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.value = output?.VALUE_
		newOutput?.version = output?.VERSION_

        newOutput
    }
}