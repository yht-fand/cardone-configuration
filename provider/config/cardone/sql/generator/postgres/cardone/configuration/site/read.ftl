SELECT
<#switch (object_id!)>
<#case "batchNo">
"batch_no"
<#break>
<#case "beginDate">
"begin_date"
<#break>
<#case "content">
"content"
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
<#case "parentCode">
"parent_code"
<#break>
<#case "parentId">
"parent_id"
<#break>
<#case "parentTreeCode">
"parent_tree_code"
<#break>
<#case "parentTreeId">
"parent_tree_id"
<#break>
<#case "parentTreeName">
"parent_tree_name"
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
<#case "systemInfoId">
"system_info_id"
<#break>
<#case "url">
"url"
<#break>
<#case "version">
"version_"
<#break>
<#default>
COUNT(*) AS COUNT_
</#switch>
FROM "c1_site"
<#include "where.ftl">