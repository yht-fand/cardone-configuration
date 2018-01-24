package top.cardone.api.vx.configuration.variable

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.VariableService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0004 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.value = input?.value
		newInput?.variableCode = input?.variableCode
		newInput?.variableId = input?.variableId
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.variableId)) {
//          throw new CodeException("variableId required", "变量标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "变量名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "变量名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "变量名称需小于{0}个字符", 255)
//      }

		def readOne = ["variableCode": input.variableCode, "object_id": "variableId", "dataStateCode": "1"]

		def dbVariableId = ApplicationContextHolder.getBean(VariableService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbVariableId, input.variableId)) {
			throw new CodeException("variableId already exists", "变量编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(VariableService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}