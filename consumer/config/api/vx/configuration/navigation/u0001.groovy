package top.cardone.api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
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
//      if (StringUtils.isBlank(input?.navigationId)) {
//          throw new CodeException("navigationId required", "导航标识必填")
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

		def readOne = ["navigationCode": input.navigationCode, "object_id": "navigationId", "dataStateCode": "1"]

		def dbNavigationId = ApplicationContextHolder.getBean(NavigationService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbNavigationId, input.navigationId)) {
			throw new CodeException("navigationId already exists", "导航编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(NavigationService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}