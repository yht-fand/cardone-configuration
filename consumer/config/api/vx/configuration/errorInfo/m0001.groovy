package api.vx.configuration.errorInfo

import org.apache.commons.lang3.StringUtils
import top.cardone.configuration.service.ErrorInfoService
import top.cardone.context.ApplicationContextHolder
import top.cardone.core.CodeException

class m0001 implements java.io.Serializable {
    def input(input) {
        def newInput = [:]

		newInput['batchNo'] = input['batchNo']
		newInput['beginDate'] = input['beginDate']
		newInput['content'] = input['content']
		newInput['createdByCode'] = input['createdByCode']
		newInput['createdDate'] = input['createdDate']
		newInput['dataStateCode'] = input['dataStateCode']
		newInput['departmentCode'] = input['departmentCode']
		newInput['endDate'] = input['endDate']
		newInput['errorInfoCode'] = input['errorInfoCode']
		newInput['errorInfoId'] = input['errorInfoId']
		newInput['flagCode'] = input['flagCode']
		newInput['flagObjectCode'] = input['flagObjectCode']
		newInput['jsonData'] = input['jsonData']
		newInput['lastModifiedByCode'] = input['lastModifiedByCode']
		newInput['lastModifiedDate'] = input['lastModifiedDate']
		newInput['objectCode'] = input['objectCode']
		newInput['objectId'] = input['objectId']
		newInput['objectTypeCode'] = input['objectTypeCode']
		newInput['orderBy'] = input['orderBy']
		newInput['orgCode'] = input['orgCode']
		newInput['personalCode'] = input['personalCode']
		newInput['siteCode'] = input['siteCode']
		newInput['stateCode'] = input['stateCode']
		newInput['systemInfoCode'] = input['systemInfoCode']
		newInput['typeCode'] = input['typeCode']
		newInput['url'] = input['url']
		newInput['version'] = input['version']

        newInput
    }

    def validation(input) {
//      if (StringUtils.isBlank(input?.errorInfoCode)) {
//          throw new CodeException("errorInfoCode required", "错误信息编号必填")
//      }
//
//      if (StringUtils.length(input?.errorInfoCode) < 4) {
//          throw new CodeException("errorInfoCode minlength", "错误信息编号需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.errorInfoCode) > 255) {
//          throw new CodeException("errorInfoCode maxlength", "错误信息编号需小于{0}个字符", 255)
//      }
//
//      if (StringUtils.isBlank(input?.name)) {
//          throw new CodeException("name required", "错误信息名称必填")
//      }
//
//      if (StringUtils.length(input?.name) < 4) {
//          throw new CodeException("name minlength", "错误信息名称需{0}个字符以上", 4)
//      }
//
//      if (StringUtils.length(input?.name) > 255) {
//          throw new CodeException("name maxlength", "错误信息名称需小于{0}个字符", 255)
//      }
		
		def readOne = ['errorInfoCode': input.errorInfoCode]

		def count = ApplicationContextHolder.getBean(ErrorInfoService.class).readOne(Integer.class, readOne)

		if (count > 0) {
			throw new CodeException("errorInfoCode already exists", "错误信息编号已经存在")
		}
    }

    def func(input) {
		ApplicationContextHolder.getBean(ErrorInfoService.class).findOne(input)
    }

    def output(output) {
        def newOutput = [:]

		newOutput['batchNo'] = output['batch_no']
		newOutput['beginDate'] = output['begin_date']
		newOutput['content'] = output['content']
		newOutput['createdByCode'] = output['created_by_code']
		newOutput['createdDate'] = output['created_date']
		newOutput['dataStateCode'] = output['data_state_code']
		newOutput['departmentCode'] = output['department_code']
		newOutput['endDate'] = output['end_date']
		newOutput['errorInfoCode'] = output['error_info_code']
		newOutput['errorInfoId'] = output['error_info_id']
		newOutput['flagCode'] = output['flag_code']
		newOutput['flagObjectCode'] = output['flag_object_code']
		newOutput['jsonData'] = output['json_data']
		newOutput['lastModifiedByCode'] = output['last_modified_by_code']
		newOutput['lastModifiedDate'] = output['last_modified_date']
		newOutput['objectCode'] = output['object_code']
		newOutput['objectId'] = output['object_id']
		newOutput['objectTypeCode'] = output['object_type_code']
		newOutput['orderBy'] = output['order_by_']
		newOutput['orgCode'] = output['org_code']
		newOutput['personalCode'] = output['personal_code']
		newOutput['siteCode'] = output['site_code']
		newOutput['stateCode'] = output['state_code']
		newOutput['systemInfoCode'] = output['system_info_code']
		newOutput['typeCode'] = output['type_code']
		newOutput['url'] = output['url']
		newOutput['version'] = output['version_']

        newOutput
    }
}