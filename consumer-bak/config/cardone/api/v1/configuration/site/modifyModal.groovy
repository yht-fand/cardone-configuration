package top.cardone.api.vx.configuration.site

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SiteService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class modifyModal implements java.io.Serializable {
    def input(input) {
        ["siteId": input.siteId]
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.siteId)) {
//          throw new CodeException("siteId required", "站点标识必填")
//      }
    }

    def func(input) {
		ApplicationContextHolder.getBean(SiteService.class).findOneBySiteId(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.BATCH_NO
		newOutput?.beginDate = output?.BEGIN_DATE
		newOutput?.content = output?.CONTENT
		newOutput?.createdByCode = output?.CREATED_BY_CODE
		newOutput?.createdById = output?.CREATED_BY_ID
		newOutput?.createdDate = output?.CREATED_DATE
		newOutput?.dataStateCode = output?.DATA_STATE_CODE
		newOutput?.departmentCode = output?.DEPARTMENT_CODE
		newOutput?.endDate = output?.END_DATE
		newOutput?.explain = output?.EXPLAIN_
		newOutput?.flagCode = output?.FLAG_CODE
		newOutput?.flagObjectCode = output?.FLAG_OBJECT_CODE
		newOutput?.ftpIp = output?.FTP_IP
		newOutput?.ftpPassword = output?.FTP_PASSWORD
		newOutput?.ftpPort = output?.FTP_PORT
		newOutput?.ftpUsername = output?.FTP_USERNAME
		newOutput?.jsonData = output?.JSON_DATA
		newOutput?.lastModifiedByCode = output?.LAST_MODIFIED_BY_CODE
		newOutput?.lastModifiedById = output?.LAST_MODIFIED_BY_ID
		newOutput?.lastModifiedDate = output?.LAST_MODIFIED_DATE
		newOutput?.latitude = output?.LATITUDE
		newOutput?.longitude = output?.LONGITUDE
		newOutput?.name = output?.NAME
		newOutput?.orderBy = output?.ORDER_BY_
		newOutput?.orgCode = output?.ORG_CODE
		newOutput?.parentCode = output?.PARENT_CODE
		newOutput?.parentId = output?.PARENT_ID
		newOutput?.parentTreeCode = output?.PARENT_TREE_CODE
		newOutput?.parentTreeId = output?.PARENT_TREE_ID
		newOutput?.parentTreeName = output?.PARENT_TREE_NAME
		newOutput?.personalCode = output?.PERSONAL_CODE
		newOutput?.personalId = output?.PERSONAL_ID
		newOutput?.postalCode = output?.POSTAL_CODE
		newOutput?.remark = output?.REMARK
		newOutput?.siteCode = output?.SITE_CODE
		newOutput?.siteId = output?.SITE_ID
		newOutput?.stateCode = output?.STATE_CODE
		newOutput?.systemInfoCode = output?.SYSTEM_INFO_CODE
		newOutput?.systemInfoId = output?.SYSTEM_INFO_ID
		newOutput?.url = output?.URL
		newOutput?.version = output?.VERSION_

        newOutput
    }
}