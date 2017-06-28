package top.cardone.api.vx.configuration.i18nInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.I18nInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class u0001 implements java.io.Serializable {
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
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.i18nInfoCode = input?.i18nInfoCode
		newInput?.i18nInfoId = input?.i18nInfoId
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.siteCode = input?.siteCode
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.i18nInfoId)) {
//          throw new CodeException("i18nInfoId required", "国际化信息标识必填")
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "国际化信息名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "国际化信息名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "国际化信息名称需小于{0}个字符", 255)
//      }

		def readOne = ["i18nInfoCode": input.i18nInfoCode, "object_id": "i18nInfoId", "dataStateCode": "1"]

		def dbI18nInfoId = ApplicationContextHolder.getBean(I18nInfoService.class).readOne(String.class, readOne)

		if (!StringUtils.equals(dbI18nInfoId, input.i18nInfoId)) {
			throw new CodeException("i18nInfoId already exists", "国际化信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(I18nInfoService.class).updateCache(input)
    }

    def output(output) {
		['updateCount': output]        
    }
}