SELECT
<#switch (object_id!)>
<#case "batchNo">
BATCH_NO
<#break>
<#case "beginDate">
BEGIN_DATE
<#break>
<#case "createdByCode">
CREATED_BY_CODE
<#break>
<#case "createdById">
CREATED_BY_ID
<#break>
<#case "createdDate">
CREATED_DATE
<#break>
<#case "dataStateCode">
DATA_STATE_CODE
<#break>
<#case "departmentCode">
DEPARTMENT_CODE
<#break>
<#case "dictionaryCode">
DICTIONARY_CODE
<#break>
<#case "dictionaryId">
DICTIONARY_ID
<#break>
<#case "dictionaryItemCode">
DICTIONARY_ITEM_CODE
<#break>
<#case "dictionaryItemId">
DICTIONARY_ITEM_ID
<#break>
<#case "dictionaryTypeCode">
DICTIONARY_TYPE_CODE
<#break>
<#case "dictionaryTypeId">
DICTIONARY_TYPE_ID
<#break>
<#case "endDate">
END_DATE
<#break>
<#case "explain">
EXPLAIN_
<#break>
<#case "flagCode">
FLAG_CODE
<#break>
<#case "flagObjectCode">
FLAG_OBJECT_CODE
<#break>
<#case "jsonData">
JSON_DATA
<#break>
<#case "lastModifiedByCode">
LAST_MODIFIED_BY_CODE
<#break>
<#case "lastModifiedById">
LAST_MODIFIED_BY_ID
<#break>
<#case "lastModifiedDate">
LAST_MODIFIED_DATE
<#break>
<#case "name">
NAME
<#break>
<#case "orderBy">
ORDER_BY_
<#break>
<#case "orgCode">
ORG_CODE
<#break>
<#case "personalCode">
PERSONAL_CODE
<#break>
<#case "personalId">
PERSONAL_ID
<#break>
<#case "remark">
REMARK
<#break>
<#case "siteCode">
SITE_CODE
<#break>
<#case "stateCode">
STATE_CODE
<#break>
<#case "systemInfoCode">
SYSTEM_INFO_CODE
<#break>
<#case "value">
VALUE_
<#break>
<#case "version">
VERSION_
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM C1_DICTIONARY_ITEM
<#include "where.ftl">