package top.cardone.api.vx.configuration.dictionaryType

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryTypeService
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
		newInput?.dictionaryTypeCode = input?.dictionaryTypeCode
		newInput?.dictionaryTypeId = input?.dictionaryTypeId
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.parentCode = input?.parentCode
		newInput?.parentTreeCode = input?.parentTreeCode
		newInput?.parentTreeId = input?.parentTreeId
		newInput?.parentTreeName = input?.parentTreeName
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.remark = input?.remark
		newInput?.siteCode = input?.siteCode
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryTypeId)) {
//          throw new CodeException("dictionaryTypeId required", "字典类别标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "字典类别名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "字典类别名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "字典类别名称需小于{0}个字符", 255)
//      }

		def readOne = ["dictionaryTypeCode": input.dictionaryTypeCode, "object_id": "dictionaryTypeId", "dataStateCode": "1"]

		def dbDictionaryTypeId = ApplicationContextHolder.getBean(DictionaryTypeService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbDictionaryTypeId, input.dictionaryTypeId)) {
			throw new CodeException("dictionaryTypeId already exists", "字典类别编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryTypeService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}