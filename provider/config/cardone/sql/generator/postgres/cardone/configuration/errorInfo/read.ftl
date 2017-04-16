SELECT
<#switch (object_id!)>
<#case "beginDate">
begin_date AS beginDate
<#break>
<#case "content">
content AS content
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
<#case "endDate">
end_date AS endDate
<#break>
<#case "errorInfoCode">
error_info_code AS errorInfoCode
<#break>
<#case "errorInfoId">
error_info_id AS errorInfoId
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
<#case "objectCode">
object_code AS objectCode
<#break>
<#case "objectId">
object_id AS objectId
<#break>
<#case "objectTypeCode">
object_type_code AS objectTypeCode
<#break>
<#case "order">
order_ AS order
<#break>
<#case "orgCode">
org_code AS orgCode
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
<#case "typeCode">
type_code AS typeCode
<#break>
<#case "version">
version_ AS version
<#break>
<#default>
COUNT(1) AS COUNT_
</#switch>
FROM c1_error_info
<#include "where.ftl">