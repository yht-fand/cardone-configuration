package top.cardone.api.vx.configuration.dictionary

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0001 implements java.io.Serializable {
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
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.value = input?.value
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryCode)) {
//          throw new CodeException("dictionaryCode required", "字典编号必填")
//      }
//
//      if (StringUtils.length(input?.dictionaryCode) < 4) {
//          throw new CodeException("dictionaryCode minlength", "字典编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.dictionaryCode) > 255) {
//          throw new CodeException("dictionaryCode maxlength", "字典编号需小于{0}个字符", 255)
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
		
		def readOne = ['dictionaryCode': input.dictionaryCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(DictionaryService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("dictionaryCode already exists", "字典编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryService.class).findOne(input)
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
		newOutput?.siteId = output?.site_id
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.value = output?.value_
		newOutput?.version = output?.version_

        newOutput
    }
}