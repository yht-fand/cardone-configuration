package api.vx.configuration.dictionary

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class c0004 {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['dictionaryCode'] = input['dictionaryCode']
		newInput['dictionaryId'] = input['dictionaryId']
		newInput['dictionaryTypeCode'] = input['dictionaryTypeCode']
		newInput['endDate'] = input['endDate']
		newInput['explain'] = input['explain']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['name'] = input['name']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['remark'] = input['remark']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['value'] = input['value']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.dictionaryCode)) {
//          throw new CodeException("dictionaryCode required", "字典编号必填")
//      }
//
//      if (StringUtils.length(input?.dictionaryCode) < 4) {
//          throw new CodeException("dictionaryCode minlength", "字典编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.dictionaryCode) > 255) {
//          throw new CodeException("dictionaryCode maxlength", "字典编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "字典名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "字典名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "字典名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['dictionaryCode': input.dictionaryCode]

		def count = ApplicationContextHolder.getBean(DictionaryService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("dictionaryCode already exists", "字典编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryService.class).insertByNotExistsCache(input)
    }

    def output(output) {
		['data': output]        
    }
}