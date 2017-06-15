package top.cardone.api.vx.configuration.site

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.SiteService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0004 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput?.batchNo = input?.batchNo
		newInput?.beginDate = input?.beginDate
		newInput?.content = input?.content
		newInput?.createdByCode = input?.createdByCode
		newInput?.createdDate = input?.createdDate
		newInput?.dataStateCode = input?.dataStateCode
		newInput?.departmentCode = input?.departmentCode
		newInput?.endDate = input?.endDate
		newInput?.explain = input?.explain
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.name = input?.name
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.siteCode = input?.siteCode
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.siteId)) {
//          throw new CodeException("siteId required", "站点标识必填")
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

		def readOne = ["siteCode": input.siteCode, "object_id": "siteId", "dataStateCode": "1"]

		String dbSiteId = ApplicationContextHolder.getBean(SiteService.class).readOne(String.class, readOne)

		if ((dbSiteId != null) && !StringUtils.equals(dbSiteId, input.siteId)) {
			throw new CodeException("siteId already exists", "站点编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(SiteService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}