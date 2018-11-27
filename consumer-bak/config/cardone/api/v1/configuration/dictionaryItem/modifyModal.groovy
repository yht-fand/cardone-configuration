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

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdById = output?.created_by_id
		newOutput?.createdDate = output?.created_date
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.dictionaryCode = output?.dictionary_code
		newOutput?.dictionaryId = output?.dictionary_id
		newOutput?.dictionaryItemCode = output?.dictionary_item_code
		newOutput?.dictionaryItemId = output?.dictionary_item_id
		newOutput?.dictionaryTypeCode = output?.dictionary_type_code
		newOutput?.dictionaryTypeId = output?.dictionary_type_id
		newOutput?.endDate = output?.end_date
		newOutput?.explain = output?.explain_
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.name = output?.name
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.remark = output?.remark
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.value = output?.value_
		newOutput?.version = output?.version_

        newOutput
    }
}