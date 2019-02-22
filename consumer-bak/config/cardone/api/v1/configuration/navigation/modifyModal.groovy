package top.cardone.api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["navigationId": input.navigationId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.navigationId)) {
//          throw new CodeException("navigationId required", "导航标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(NavigationService.class).findOneByNavigationId(input)
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