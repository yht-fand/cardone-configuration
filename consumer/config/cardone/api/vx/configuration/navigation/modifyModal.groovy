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

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdById = output?.created_by_id
		newOutput?.createdDate = output?.created_date
		newOutput?.dataOption = output?.data_option
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.endDate = output?.end_date
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.iconStyle = output?.icon_style
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.name = output?.name
		newOutput?.navigationCode = output?.navigation_code
		newOutput?.navigationId = output?.navigation_id
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.parentCode = output?.parent_code
		newOutput?.parentId = output?.parent_id
		newOutput?.parentTreeCode = output?.parent_tree_code
		newOutput?.parentTreeId = output?.parent_tree_id
		newOutput?.parentTreeName = output?.parent_tree_name
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.target = output?.target
		newOutput?.typeCode = output?.type_code
		newOutput?.url = output?.url
		newOutput?.version = output?.version_

        newOutput
    }
}