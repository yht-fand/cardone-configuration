SELECT
<#switch (object_id!)>
<#case "batchNo">
batch_no AS batchNo
<#break>
<#case "beginDate">
begin_date AS beginDate
<#break>
<#case "createdByCode">
created_by_code AS createdByCode
<#break>
<#case "createdDate">
created_date AS createdDate
<#break>
<#case "dataStateCode">
data_state_code AS dataStateCode
<#break>
<#case "departmentCode">
department_code AS departmentCode
<#break>
<#case "dictionaryCode">
dictionary_code AS dictionaryCode
<#break>
<#case "dictionaryItemCode">
dictionary_item_code AS dictionaryItemCode
<#break>
<#case "dictionaryItemId">
dictionary_item_id AS dictionaryItemId
<#break>
<#case "dictionaryTypeCode">
dictionary_type_code AS dictionaryTypeCode
<#break>
<#case "endDate">
end_date AS endDate
<#break>
<#case "explain">
explain_ AS explain
<#break>
<#case "flagCode">
flag_code AS flagCode
<#break>
<#case "flagObjectCode">
flag_object_code AS flagObjectCode
<#break>
<#case "jsonData">
json_data AS jsonData
<#break>
<#case "lastModifiedByCode">
last_modified_by_code AS lastModifiedByCode
<#break>
<#case "lastModifiedDate">
last_modified_date AS lastModifiedDate
<#break>
<#case "name">
name AS name
<#break>
<#case "orderBy">
order_by_ AS orderBy
<#break>
<#case "orgCode">
org_code AS orgCode
<#break>
<#case "personalCode">
personal_code AS personalCode
<#break>
<#case "remark">
remark AS remark
<#break>
<#case "siteCode">
site_code AS siteCode
<#break>
<#case "stateCode">
state_code AS stateCode
<#break>
<#case "systemInfoCode">
system_info_code AS systemInfoCode
<#break>
<#case "value">
value_ AS value
<#break>
<#case "version">
version_ AS version
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM c1_dictionary_item
<#include "where.ftl">