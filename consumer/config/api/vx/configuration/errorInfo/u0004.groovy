package api.vx.configuration.errorInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.ErrorInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0004 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['content'] = input['content']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['endDate'] = input['endDate']
		newInput['errorInfoCode'] = input['errorInfoCode']
		newInput['errorInfoId'] = input['errorInfoId']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['objectCode'] = input['objectCode']
		newInput['objectId'] = input['objectId']
		newInput['objectTypeCode'] = input['objectTypeCode']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['typeCode'] = input['typeCode']
		newInput['url'] = input['url']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.errorInfoId)) {
//          throw new CodeException("errorInfoId required", "错误信息标识必填")
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

		def readOne = ["errorInfoCode": input.errorInfoCode, "object_id": "errorInfoId"]

		String dbErrorInfoId = ApplicationContextHolder.getBean(ErrorInfoService.class).readOne(String.class, readOne)

		if ((dbErrorInfoId != null) && !StringUtils.equals(dbErrorInfoId, input.errorInfoId)) {
			throw new CodeException("errorInfoId already exists", "错误信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(ErrorInfoService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]
    }
}