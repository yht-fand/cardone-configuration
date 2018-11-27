package top.cardone.api.vx.configuration.variable

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.VariableService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["variableId": input.variableId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.variableId)) {
//          throw new CodeException("variableId required", "变量标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(VariableService.class).findOneByVariableId(input)
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
		newOutput?.endDate = output?.end_date
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.siteCode = output?.site_code
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.value = output?.value_
		newOutput?.variableCode = output?.variable_code
		newOutput?.variableId = output?.variable_id
		newOutput?.version = output?.version_

        newOutput
    }
}