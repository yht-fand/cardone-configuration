package top.cardone.api.vx.configuration.errorInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.ErrorInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0003 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.content = input?.content
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.errorInfoCode = input?.errorInfoCode
		newInput?.errorInfoId = input?.errorInfoId
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.objectCode = input?.objectCode
		newInput?.objectId = input?.objectId
		newInput?.objectTypeCode = input?.objectTypeCode
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.url = input?.url
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.errorInfoCode)) {
//          throw new CodeException("errorInfoCode required", "错误信息编号必填")
//      }
//
//      if (StringUtils.length(input?.errorInfoCode) < 4) {
//          throw new CodeException("errorInfoCode minlength", "错误信息编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.errorInfoCode) > 255) {
//          throw new CodeException("errorInfoCode maxlength", "错误信息编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "错误信息名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "错误信息名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "错误信息名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['errorInfoCode': input.errorInfoCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(ErrorInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("errorInfoCode already exists", "错误信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(ErrorInfoService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}