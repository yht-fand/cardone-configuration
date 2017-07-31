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
<#case "createdById">
"created_by_id"
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
<#case "dictionaryId">
"dictionary_id"
<#break>
<#case "dictionaryTypeCode">
"dictionary_type_code"
<#break>
<#case "dictionaryTypeId">
"dictionary_type_id"
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
<#case "lastModifiedById">
"last_modified_by_id"
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
<#case "personalId">
"personal_id"
<#break>
<#case "remark">
"remark"
<#break>
<#case "siteCode">
"site_code"
<#break>
<#case "siteId">
"site_id"
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
FROM c1_dictionary
<#include "where.ftl">