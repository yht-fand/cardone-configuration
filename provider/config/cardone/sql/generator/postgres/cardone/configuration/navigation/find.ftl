SELECT
<#assign prefixName = ' '>
<#if (select_batchNo??)>
${prefixName} "batch_no"
<#assign prefixName = ','>
</#if>
<#if (select_beginDate??)>
${prefixName} "begin_date"
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} "created_by_code"
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} "created_date"
<#assign prefixName = ','>
</#if>
<#if (select_dataOption??)>
${prefixName} "data_option"
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} "data_state_code"
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} "department_code"
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} "end_date"
<#assign prefixName = ','>
</#if>
<#if (select_flagCode??)>
${prefixName} "flag_code"
<#assign prefixName = ','>
</#if>
<#if (select_flagObjectCode??)>
${prefixName} "flag_object_code"
<#assign prefixName = ','>
</#if>
<#if (select_iconStyle??)>
${prefixName} "icon_style"
<#assign prefixName = ','>
</#if>
<#if (select_jsonData??)>
${prefixName} "json_data"
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} "last_modified_by_code"
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} "last_modified_date"
<#assign prefixName = ','>
</#if>
<#if (select_name??)>
${prefixName} "name"
<#assign prefixName = ','>
</#if>
<#if (select_navigationCode??)>
${prefixName} "navigation_code"
<#assign prefixName = ','>
</#if>
<#if (select_navigationId??)>
${prefixName} "navigation_id"
<#assign prefixName = ','>
</#if>
<#if (select_orderBy??)>
${prefixName} "order_by_"
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} "org_code"
<#assign prefixName = ','>
</#if>
<#if (select_parentCode??)>
${prefixName} "parent_code"
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeCode??)>
${prefixName} "parent_tree_code"
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeName??)>
${prefixName} "parent_tree_name"
<#assign prefixName = ','>
</#if>
<#if (select_personalCode??)>
${prefixName} "personal_code"
<#assign prefixName = ','>
</#if>
<#if (select_siteCode??)>
${prefixName} "site_code"
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} "state_code"
<#assign prefixName = ','>
</#if>
<#if (select_systemInfoCode??)>
${prefixName} "system_info_code"
<#assign prefixName = ','>
</#if>
<#if (select_target??)>
${prefixName} "target"
<#assign prefixName = ','>
</#if>
<#if (select_typeCode??)>
${prefixName} "type_code"
<#assign prefixName = ','>
</#if>
<#if (select_url??)>
${prefixName} "url"
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} "version_"
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
*
</#if>
FROM c1_navigation
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_batchNo??)>
${prefixName} "batch_no" ${order_by_batchNo_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_beginDate??)>
${prefixName} "begin_date" ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} "created_by_code" ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} "created_date" ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataOption??)>
${prefixName} "data_option" ${order_by_dataOption_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} "data_state_code" ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} "department_code" ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} "end_date" ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagCode??)>
${prefixName} "flag_code" ${order_by_flagCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName} "flag_object_code" ${order_by_flagObjectCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_iconStyle??)>
${prefixName} "icon_style" ${order_by_iconStyle_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_jsonData??)>
${prefixName} "json_data" ${order_by_jsonData_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} "last_modified_by_code" ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} "last_modified_date" ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_name??)>
${prefixName} "name" ${order_by_name_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationCode??)>
${prefixName} "navigation_code" ${order_by_navigationCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationId??)>
${prefixName} "navigation_id" ${order_by_navigationId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orderBy??)>
${prefixName} "order_by_" ${order_by_orderBy_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} "org_code" ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentCode??)>
${prefixName} "parent_code" ${order_by_parentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName} "parent_tree_code" ${order_by_parentTreeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName} "parent_tree_name" ${order_by_parentTreeName_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_personalCode??)>
${prefixName} "personal_code" ${order_by_personalCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_siteCode??)>
${prefixName} "site_code" ${order_by_siteCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} "state_code" ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName} "system_info_code" ${order_by_systemInfoCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_target??)>
${prefixName} "target" ${order_by_target_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_typeCode??)>
${prefixName} "type_code" ${order_by_typeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_url??)>
${prefixName} "url" ${order_by_url_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} "version_" ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
