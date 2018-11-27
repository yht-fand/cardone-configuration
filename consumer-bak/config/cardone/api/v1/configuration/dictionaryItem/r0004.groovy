package top.cardone.api.vx.configuration.dictionaryItem

import top.cardone.configuration.service.DictionaryService
import top.cardone.context.ApplicationContextHolder
import top.cardone.context.util.DateUtils
import top.cardone.configuration.service.DictionaryItemService

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

class r0004 implements java.io.Serializable {
    def input(input) {
        input.startTime = DateUtils.parseDate(input.startTime)

        input.endTime = DateUtils.parseDate(input.endTime)

        if (Objects.nonNull(input.endTime)) {
            input.endTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(input.endTime.getTime()), ZoneId.systemDefault())

            input.endTime = Date.from(LocalDateTime.of(input.endTime.getYear(), input.endTime.getMonth(), input.endTime.getDayOfMonth(), 0, 0, 0).plusDays(1).atZone(ZoneId.systemDefault()).toInstant())
        }

        input
    }

    def validation(input) {
    }

    def func(input) {
		ApplicationContextHolder.getBean(DictionaryItemService.class).page(input)
    }

    def output(output) {
        def newOutput = [:]

        newOutput.totalElements = output.getTotalElements()
        newOutput.totalPages = output.getTotalPages()
        newOutput.hasPrevious = output.hasPrevious()
        newOutput.previous = output.pageable.previousOrFirst().getPageNumber() + 1
        newOutput.hasNext = output.pageable.next().getPageNumber() < output.getTotalPages()
        newOutput.next = output.pageable.next().getPageNumber() + 1
        newOutput.pages = []
        newOutput.page = output.getNumber() + 1

        def pagesRange = 6

        def pagesRangeHalf = new java.math.BigDecimal(pagesRange).divide(new BigDecimal(2), BigDecimal.ROUND_HALF_UP).toBigInteger().intValue()

        def pagesRangeStart = Math.max(output.getNumber() + 1 - pagesRangeHalf, 1)

        def pagesRangeEnd = Math.min((pagesRangeStart + pagesRange) - 1, output.getTotalPages())

        if (((pagesRangeEnd - pagesRangeStart) + 1) < pagesRange) {
            pagesRangeStart = Math.max((pagesRangeEnd - pagesRange) + 1, 1)
        }

        def pagesRangeLength = pagesRangeEnd - pagesRangeStart

        for (int i = 0; i <= pagesRangeLength; i++) {
            newOutput.pages.add(pagesRangeStart++)
        }

        newOutput.datas = []

        for (def contentItem : output.getContent()) {
			def data = [:]

            data['batchNo'] = contentItem['batch_no']

            data['beginDate'] = contentItem['begin_date']

            data['createdByCode'] = contentItem['created_by_code']

            data['createdById'] = contentItem['created_by_id']

            data['createdDate'] = contentItem['created_date']

            data['dataStateCode'] = contentItem['data_state_code']

            data['departmentCode'] = contentItem['department_code']

            data['dictionaryCode'] = contentItem['dictionary_code']

            data['dictionaryId'] = contentItem['dictionary_id']

            data['dictionaryItemCode'] = contentItem['dictionary_item_code']

            data['dictionaryItemId'] = contentItem['dictionary_item_id']

            data['dictionaryTypeCode'] = contentItem['dictionary_type_code']

            data['dictionaryTypeId'] = contentItem['dictionary_type_id']

            data['endDate'] = contentItem['end_date']

            data['explain'] = contentItem['explain_']

            data['flagCode'] = contentItem['flag_code']

            data['flagObjectCode'] = contentItem['flag_object_code']

            data['jsonData'] = contentItem['json_data']

            data['lastModifiedByCode'] = contentItem['last_modified_by_code']

            data['lastModifiedById'] = contentItem['last_modified_by_id']

            data['lastModifiedDate'] = contentItem['last_modified_date']

            data['name'] = contentItem['name']

            data['orderBy'] = contentItem['order_by_']

            data['orgCode'] = contentItem['org_code']

            data['personalCode'] = contentItem['personal_code']

            data['personalId'] = contentItem['personal_id']

            data['remark'] = contentItem['remark']

            data['siteCode'] = contentItem['site_code']

            data['stateCode'] = contentItem['state_code']

            data['systemInfoCode'] = contentItem['system_info_code']

            data['value'] = contentItem['value_']

            data['version'] = contentItem['version_']

            data['flagName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'dictionaryItemFlag,flag', 'dictionaryCode': contentItem['flag_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

            data['stateName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'dictionaryItemState,state', 'dictionaryCode': contentItem['state_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

            data['dataStateName'] = top.cardone.configuration.utils.DictionaryUtils.readOneByDictionaryTypeCodesCache(['dictionaryTypeCodes': 'dictionaryItemDataState,dataState', 'dictionaryCode': contentItem['data_state_code'], 'stateCode': '1', 'dataStateCode': '1',  'object_id': 'name'])

			newOutput.datas.add(data)
        }

        newOutput
    }
}