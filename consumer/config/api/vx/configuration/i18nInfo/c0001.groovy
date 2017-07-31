package top.cardone.api.vx.configuration.i18nInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.I18nInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0001 implements java.io.Serializable {
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
		newInput?.flagCode = input?.flagCode
		newInput?.flagObjectCode = input?.flagObjectCode
		newInput?.i18nInfoCode = input?.i18nInfoCode
		newInput?.i18nInfoId = input?.i18nInfoId
		newInput?.jsonData = input?.jsonData
		newInput?.lastModifiedByCode = input?.lastModifiedByCode
		newInput?.lastModifiedById = input?.lastModifiedById
		newInput?.lastModifiedDate = input?.lastModifiedDate
		newInput?.orderBy = input?.orderBy
		newInput?.orgCode = input?.orgCode
		newInput?.personalCode = input?.personalCode
		newInput?.personalId = input?.personalId
		newInput?.siteCode = input?.siteCode
		newInput?.siteId = input?.siteId
		newInput?.stateCode = input?.stateCode
		newInput?.systemInfoCode = input?.systemInfoCode
		newInput?.typeCode = input?.typeCode
		newInput?.version = input?.version

        newInput.flagCode = StringUtils.defaultIfBlank(input.flagCode, "input")

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.i18nInfoCode)) {
//          throw new CodeException("i18nInfoCode required", "国际化信息编号必填")
//      }
//
//      if (StringUtils.length(input?.i18nInfoCode) < 4) {
//          throw new CodeException("i18nInfoCode minlength", "国际化信息编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.i18nInfoCode) > 255) {
//          throw new CodeException("i18nInfoCode maxlength", "国际化信息编号需小于{0}个字符", 255)
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
		
		def readOne = ['i18nInfoCode': input.i18nInfoCode, "dataStateCode": "1"]

		def count = ApplicationContextHolder.getBean(I18nInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("i18nInfoCode already exists", "国际化信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(I18nInfoService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]        
    }
}