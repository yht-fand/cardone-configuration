package top.cardone.api.vx.configuration.site

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SiteService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0003 implements java.io.Serializable {
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
		newInput?.explain = input?.explain
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.ftpIp = input?.ftpIp
		newInput?.ftpPassword = input?.ftpPassword
		newInput?.ftpPort = input?.ftpPort
		newInput?.ftpUsername = input?.ftpUsername
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.parentCode = input?.parentCode
		newInput?.parentId = input?.parentId
		newInput?.parentTreeCode = input?.parentTreeCode
		newInput?.parentTreeId = input?.parentTreeId
		newInput?.parentTreeName = input?.parentTreeName
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.remark = input?.remark
		newInput?.siteCode = input?.siteCode
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.systemInfoId = input?.systemInfoId
		newInput?.url = input?.url
		newInput?.version = input?.version

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.siteCode)) {
//          throw new CodeException("siteCode required", "站点编号必填")
//      }
//
//      if (StringUtils.length(input?.siteCode) < 4) {
//          throw new CodeException("siteCode minlength", "站点编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.siteCode) > 255) {
//          throw new CodeException("siteCode maxlength", "站点编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "站点名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "站点名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "站点名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['siteCode': input.siteCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(SiteService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("siteCode already exists", "站点编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(SiteService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput?.batchNo = output?.batch_no
		newOutput?.beginDate = output?.begin_date
		newOutput?.content = output?.content
		newOutput?.createdByCode = output?.created_by_code
		newOutput?.createdById = output?.created_by_id
		newOutput?.createdDate = output?.created_date
		newOutput?.dataStateCode = output?.data_state_code
		newOutput?.departmentCode = output?.department_code
		newOutput?.endDate = output?.end_date
		newOutput?.explain = output?.explain_
		newOutput?.flagCode = output?.flag_code
		newOutput?.flagObjectCode = output?.flag_object_code
		newOutput?.ftpIp = output?.ftp_ip
		newOutput?.ftpPassword = output?.ftp_password
		newOutput?.ftpPort = output?.ftp_port
		newOutput?.ftpUsername = output?.ftp_username
		newOutput?.jsonData = output?.json_data
		newOutput?.lastModifiedByCode = output?.last_modified_by_code
		newOutput?.lastModifiedById = output?.last_modified_by_id
		newOutput?.lastModifiedDate = output?.last_modified_date
		newOutput?.name = output?.name
		newOutput?.orderBy = output?.order_by_
		newOutput?.orgCode = output?.org_code
		newOutput?.parentCode = output?.parent_code
		newOutput?.parentId = output?.parent_id
		newOutput?.parentTreeCode = output?.parent_tree_code
		newOutput?.parentTreeId = output?.parent_tree_id
		newOutput?.parentTreeName = output?.parent_tree_name
		newOutput?.personalCode = output?.personal_code
		newOutput?.personalId = output?.personal_id
		newOutput?.remark = output?.remark
		newOutput?.siteCode = output?.site_code
		newOutput?.siteId = output?.site_id
		newOutput?.stateCode = output?.state_code
		newOutput?.systemInfoCode = output?.system_info_code
		newOutput?.systemInfoId = output?.system_info_id
		newOutput?.url = output?.url
		newOutput?.version = output?.version_

        newOutput
    }
}