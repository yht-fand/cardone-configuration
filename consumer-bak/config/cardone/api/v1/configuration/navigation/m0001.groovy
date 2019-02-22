package top.cardone.api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
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
		ApplicationContextHolder.getBean(NavigationService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
		newOutput?.createdByCode = output?.CREATED_BY_CODE
		newOutput?.createdById = output?.CREATED_BY_ID
		newOutput?.createdDate = output?.CREATED_DATE
		newOutput?.dataOption = output?.DATA_OPTION
		newOutput?.dataStateCode = output?.DATA_STATE_CODE
		newOutput?.departmentCode = output?.DEPARTMENT_CODE
		newOutput?.endDate = output?.END_DATE
		newOutput?.flagCode = output?.FLAG_CODE
		newOutput?.flagObjectCode = output?.FLAG_OBJECT_CODE
		newOutput?.iconStyle = output?.ICON_STYLE
		newOutput?.jsonData = output?.JSON_DATA
		newOutput?.lastModifiedByCode = output?.LAST_MODIFIED_BY_CODE
		newOutput?.lastModifiedById = output?.LAST_MODIFIED_BY_ID
		newOutput?.lastModifiedDate = output?.LAST_MODIFIED_DATE
		newOutput?.name = output?.NAME
		newOutput?.navigationCode = output?.NAVIGATION_CODE
		newOutput?.navigationId = output?.NAVIGATION_ID
		newOutput?.orderBy = output?.ORDER_BY_
		newOutput?.orgCode = output?.ORG_CODE
		newOutput?.parentCode = output?.PARENT_CODE
		newOutput?.parentId = output?.PARENT_ID
		newOutput?.parentTreeCode = output?.PARENT_TREE_CODE
		newOutput?.parentTreeId = output?.PARENT_TREE_ID
		newOutput?.parentTreeName = output?.PARENT_TREE_NAME
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.target = output?.TARGET
		newOutput?.typeCode = output?.TYPE_CODE
		newOutput?.url = output?.URL
		newOutput?.version = output?.VERSION_

        newOutput
    }
}