package api.vx.configuration.navigation

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.NavigationService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0002 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataOption'] = input['dataOption']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['endDate'] = input['endDate']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['iconStyle'] = input['iconStyle']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['name'] = input['name']
		newInput['navigationCode'] = input['navigationCode']
		newInput['navigationId'] = input['navigationId']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['parentCode'] = input['parentCode']
		newInput['parentTreeCode'] = input['parentTreeCode']
		newInput['parentTreeName'] = input['parentTreeName']
		newInput['personalCode'] = input['personalCode']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['target'] = input['target']
		newInput['typeCode'] = input['typeCode']
		newInput['url'] = input['url']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.navigationCode)) {
//          throw new CodeException("navigationCode required", "导航编号必填")
//      }
//
//      if (StringUtils.length(input?.navigationCode) < 4) {
//          throw new CodeException("navigationCode minlength", "导航编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.navigationCode) > 255) {
//          throw new CodeException("navigationCode maxlength", "导航编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "导航名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "导航名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "导航名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['navigationCode': input.navigationCode]

		def count = ApplicationContextHolder.getBean(NavigationService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("navigationCode already exists", "导航编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(NavigationService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['createdByCode'] = output['created_by_code']
		newOutput['createdDate'] = output['created_date']
		newOutput['dataOption'] = output['data_option']
		newOutput['dataStateCode'] = output['data_state_code']
		newOutput['departmentCode'] = output['department_code']
		newOutput['endDate'] = output['end_date']
		newOutput['flagCode'] = output['flag_code']
		newOutput['flagObjectCode'] = output['flag_object_code']
		newOutput['iconStyle'] = output['icon_style']
		newOutput['jsonData'] = output['json_data']
		newOutput['lastModifiedByCode'] = output['last_modified_by_code']
		newOutput['lastModifiedDate'] = output['last_modified_date']
		newOutput['name'] = output['name']
		newOutput['navigationCode'] = output['navigation_code']
		newOutput['navigationId'] = output['navigation_id']
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['parentCode'] = output['parent_code']
		newOutput['parentTreeCode'] = output['parent_tree_code']
		newOutput['parentTreeName'] = output['parent_tree_name']
		newOutput['personalCode'] = output['personal_code']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['target'] = output['target']
		newOutput['typeCode'] = output['type_code']
		newOutput['url'] = output['url']
		newOutput['version'] = output['version_']

        newOutput
    }
}