package top.cardone.api.vx.configuration.dictionary

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0003 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.dictionaryCode = input?.dictionaryCode
		newInput?.dictionaryId = input?.dictionaryId
		newInput?.dictionaryTypeCode = input?.dictionaryTypeCode
		newInput?.endDate = input?.endDate
		newInput?.explain = input?.explain
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
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
//      if (StringUtils.isBlank(input?.dictionaryId)) {
//          throw new CodeException("dictionaryId required", "字典标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "字典名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "字典名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "字典名称需小于{0}个字符", 255)
//      }

		def readOne = ["dictionaryCode": input.dictionaryCode, "object_id": "dictionaryId", "dataStateCode": "1"]

		String dbDictionaryId = ApplicationContextHolder.getBean(DictionaryService.class).readOne(String.class, readOne)

		if ((dbDictionaryId != null) && !StringUtils.equals(dbDictionaryId, input.dictionaryId)) {
			throw new CodeException("dictionaryId already exists", "字典编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}