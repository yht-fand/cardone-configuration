package api.vx.configuration.dictionaryType

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.DictionaryTypeService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0004 implements java.io.Serializable {
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
		ApplicationContextHolder.getBean(DictionaryTypeService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['createdByCode'] = output['created_by_code']
		newOutput['createdDate'] = output['created_date']
		newOutput['dataStateCode'] = output['data_state_code']
		newOutput['departmentCode'] = output['department_code']
		newOutput['dictionaryTypeCode'] = output['dictionary_type_code']
		newOutput['dictionaryTypeId'] = output['dictionary_type_id']
		newOutput['endDate'] = output['end_date']
		newOutput['flagCode'] = output['flag_code']
		newOutput['flagObjectCode'] = output['flag_object_code']
		newOutput['jsonData'] = output['json_data']
		newOutput['lastModifiedByCode'] = output['last_modified_by_code']
		newOutput['lastModifiedDate'] = output['last_modified_date']
		newOutput['name'] = output['name']
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['parentCode'] = output['parent_code']
		newOutput['parentTreeCode'] = output['parent_tree_code']
		newOutput['parentTreeName'] = output['parent_tree_name']
		newOutput['personalCode'] = output['personal_code']
		newOutput['remark'] = output['remark']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['version'] = output['version_']

        newOutput
    }
}