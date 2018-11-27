package top.cardone.api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0003 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdById = input?.createdById
		newInput?.createdDate = input?.createdDate
		newInput?.dataOption = input?.dataOption
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.iconStyle = input?.iconStyle
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.navigationCode = input?.navigationCode
		newInput?.navigationId = input?.navigationId
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.parentCode = input?.parentCode
		newInput?.parentId = input?.parentId
		newInput?.parentTreeCode = input?.parentTreeCode
		newInput?.parentTreeId = input?.parentTreeId
		newInput?.parentTreeName = input?.parentTreeName
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.target = input?.target
		newInput?.typeCode = input?.typeCode
		newInput?.url = input?.url
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.navigationCode)) {
//          throw new CodeException("navigationCode required", "导航编号必填")
//      }
//
//      if (StringUtils.length(input?.navigationCode) < 4) {
//          throw new CodeException("navigationCode minlength", "导航编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.navigationCode) > 255) {
//          throw new CodeException("navigationCode maxlength", "导航编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "导航名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "导航名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "导航名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['navigationCode': input.navigationCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(NavigationService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("navigationCode already exists", "导航编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(NavigationService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}