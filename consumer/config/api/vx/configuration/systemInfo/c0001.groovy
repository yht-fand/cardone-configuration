package api.vx.configuration.systemInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SystemInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 implements java.io.Serializable {
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
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['name'] = input['name']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['remark'] = input['remark']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['systemInfoId'] = input['systemInfoId']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.systemInfoCode)) {
//          throw new CodeException("systemInfoCode required", "系统信息编号必填")
//      }
//
//      if (StringUtils.length(input?.systemInfoCode) < 4) {
//          throw new CodeException("systemInfoCode minlength", "系统信息编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.systemInfoCode) > 255) {
//          throw new CodeException("systemInfoCode maxlength", "系统信息编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "系统信息名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "系统信息名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "系统信息名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['systemInfoCode': input.systemInfoCode]

		def count = ApplicationContextHolder.getBean(SystemInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("systemInfoCode already exists", "系统信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(SystemInfoService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]
    }
}