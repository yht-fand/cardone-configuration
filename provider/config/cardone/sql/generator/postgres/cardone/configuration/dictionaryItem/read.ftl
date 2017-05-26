SELECT
<#switch (object_id!)>
<#case "batchNo">
"batch_no"
<#break>
<#case "beginDate">
"begin_date"
<#break>
<#case "createdByCode">
"created_by_code"
<#break>
<#case "createdDate">
"created_date"
<#break>
<#case "dataStateCode">
"data_state_code"
<#break>
<#case "departmentCode">
"department_code"
<#break>
<#case "dictionaryCode">
"dictionary_code"
<#break>
<#case "dictionaryItemCode">
"dictionary_item_code"
<#break>
<#case "dictionaryItemId">
"dictionary_item_id"
<#break>
<#case "dictionaryTypeCode">
"dictionary_type_code"
<#break>
<#case "endDate">
"end_date"
<#break>
<#case "explain">
"explain_"
<#break>
<#case "flagCode">
"flag_code"
<#break>
<#case "flagObjectCode">
"flag_object_code"
<#break>
<#case "jsonData">
"json_data"
<#break>
<#case "lastModifiedByCode">
"last_modified_by_code"
<#break>
<#case "lastModifiedDate">
"last_modified_date"
<#break>
<#case "name">
"name"
<#break>
<#case "orderBy">
"order_by_"
<#break>
<#case "orgCode">
"org_code"
<#break>
<#case "personalCode">
"personal_code"
<#break>
<#case "remark">
"remark"
<#break>
<#case "siteCode">
"site_code"
<#break>
<#case "stateCode">
"state_code"
<#break>
<#case "systemInfoCode">
"system_info_code"
<#break>
<#case "value">
"value_"
<#break>
<#case "version">
"version_"
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM c1_dictionary_item
<#include "where.ftl">