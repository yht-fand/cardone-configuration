package top.cardone.api.vx.configuration.dictionaryItem

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryItemService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0001 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.dictionaryCode = input?.dictionaryCode
		newInput?.dictionaryId = input?.dictionaryId
		newInput?.dictionaryItemCode = input?.dictionaryItemCode
		newInput?.dictionaryItemId = input?.dictionaryItemId
		newInput?.dictionaryTypeCode = input?.dictionaryTypeCode
		newInput?.dictionaryTypeId = input?.dictionaryTypeId
		newInput?.endDate = input?.endDate
		newInput?.explain = input?.explain
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.remark = input?.remark
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.value = input?.value
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryItemId)) {
//          throw new CodeException("dictionaryItemId required", "字典项标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "字典项名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "字典项名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "字典项名称需小于{0}个字符", 255)
//      }

		def readOne = ["dictionaryItemCode": input.dictionaryItemCode, "object_id": "dictionaryItemId", "dataStateCode": "1"]

		def dbDictionaryItemId = ApplicationContextHolder.getBean(DictionaryItemService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbDictionaryItemId, input.dictionaryItemId)) {
			throw new CodeException("dictionaryItemId already exists", "字典项编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryItemService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}