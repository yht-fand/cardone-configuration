package api.vx.configuration.dictionaryType

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryTypeService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0003 {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['dictionaryTypeCode'] = input['dictionaryTypeCode']
		newInput['dictionaryTypeId'] = input['dictionaryTypeId']
		newInput['endDate'] = input['endDate']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['name'] = input['name']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['parentCode'] = input['parentCode']
		newInput['parentTreeCode'] = input['parentTreeCode']
		newInput['parentTreeName'] = input['parentTreeName']
		newInput['personalCode'] = input['personalCode']
		newInput['remark'] = input['remark']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryTypeCode)) {
//          throw new CodeException("dictionaryTypeCode required", "字典类别编号必填")
//      }
//
//      if (StringUtils.length(input?.dictionaryTypeCode) < 4) {
//          throw new CodeException("dictionaryTypeCode minlength", "字典类别编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.dictionaryTypeCode) > 255) {
//          throw new CodeException("dictionaryTypeCode maxlength", "字典类别编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "字典类别名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "字典类别名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "字典类别名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['dictionaryTypeCode': input.dictionaryTypeCode]

		def count = ApplicationContextHolder.getBean(DictionaryTypeService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("dictionaryTypeCode already exists", "字典类别编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryTypeService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['insertCount': output]
    }
}