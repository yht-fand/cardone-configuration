<#include "insert.ftl">
on conflict (
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')}"batch_no"
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')}"begin_date"
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')}"created_by_code"
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')}"created_by_id"
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')}"created_date"
<#assign prefixName = false>
</#if>
<#if (index_dataOption??)>
${prefixName?string('', ', ')}"data_option"
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')}"data_state_code"
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')}"department_code"
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')}"end_date"
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')}"flag_code"
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')}"flag_object_code"
<#assign prefixName = false>
</#if>
<#if (index_iconStyle??)>
${prefixName?string('', ', ')}"icon_style"
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')}"json_data"
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')}"last_modified_by_code"
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')}"last_modified_by_id"
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')}"last_modified_date"
<#assign prefixName = false>
</#if>
<#if (index_name??)>
${prefixName?string('', ', ')}"name"
<#assign prefixName = false>
</#if>
<#if (index_navigationCode??)>
${prefixName?string('', ', ')}"navigation_code"
<#assign prefixName = false>
</#if>
<#if (index_navigationId??)>
${prefixName?string('', ', ')}"navigation_id"
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')}"order_by_"
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')}"org_code"
<#assign prefixName = false>
</#if>
<#if (index_parentCode??)>
${prefixName?string('', ', ')}"parent_code"
<#assign prefixName = false>
</#if>
<#if (index_parentId??)>
${prefixName?string('', ', ')}"parent_id"
<#assign prefixName = false>
</#if>
<#if (index_parentTreeCode??)>
${prefixName?string('', ', ')}"parent_tree_code"
<#assign prefixName = false>
</#if>
<#if (index_parentTreeId??)>
${prefixName?string('', ', ')}"parent_tree_id"
<#assign prefixName = false>
</#if>
<#if (index_parentTreeName??)>
${prefixName?string('', ', ')}"parent_tree_name"
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')}"personal_code"
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')}"personal_id"
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}"site_code"
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')}"state_code"
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')}"system_info_code"
<#assign prefixName = false>
</#if>
<#if (index_target??)>
${prefixName?string('', ', ')}"target"
<#assign prefixName = false>
</#if>
<#if (index_typeCode??)>
${prefixName?string('', ', ')}"type_code"
<#assign prefixName = false>
</#if>
<#if (index_url??)>
${prefixName?string('', ', ')}"url"
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')}"version_"
<#assign prefixName = false>
</#if>
) do update set
<#assign prefixName = true>
<#if (update_batchNo??)>
${prefixName?string('', ', ')}"batch_no" = :update_batchNo_value
<#assign prefixName = false>
</#if>
<#if (update_beginDate??)>
${prefixName?string('', ', ')}"begin_date" = :update_beginDate_value
<#assign prefixName = false>
</#if>
<#if (update_createdByCode??)>
${prefixName?string('', ', ')}"created_by_code" = :update_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (update_createdById??)>
${prefixName?string('', ', ')}"created_by_id" = :update_createdById_value
<#assign prefixName = false>
</#if>
<#if (update_createdDate??)>
${prefixName?string('', ', ')}"created_date" = :update_createdDate_value
<#assign prefixName = false>
</#if>
<#if (update_dataOption??)>
${prefixName?string('', ', ')}"data_option" = :update_dataOption_value
<#assign prefixName = false>
</#if>
<#if (update_dataStateCode??)>
${prefixName?string('', ', ')}"data_state_code" = :update_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (update_departmentCode??)>
${prefixName?string('', ', ')}"department_code" = :update_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (update_endDate??)>
${prefixName?string('', ', ')}"end_date" = :update_endDate_value
<#assign prefixName = false>
</#if>
<#if (update_flagCode??)>
${prefixName?string('', ', ')}"flag_code" = :update_flagCode_value
<#assign prefixName = false>
</#if>
<#if (update_flagObjectCode??)>
${prefixName?string('', ', ')}"flag_object_code" = :update_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (update_iconStyle??)>
${prefixName?string('', ', ')}"icon_style" = :update_iconStyle_value
<#assign prefixName = false>
</#if>
<#if (update_jsonData??)>
${prefixName?string('', ', ')}"json_data" = :update_jsonData_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName?string('', ', ')}"last_modified_by_code" = :update_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedById??)>
${prefixName?string('', ', ')}"last_modified_by_id" = :update_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName?string('', ', ')}"last_modified_date" = :update_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (update_name??)>
${prefixName?string('', ', ')}"name" = :update_name_value
<#assign prefixName = false>
</#if>
<#if (update_navigationCode??)>
${prefixName?string('', ', ')}"navigation_code" = :update_navigationCode_value
<#assign prefixName = false>
</#if>
<#if (update_navigationId??)>
${prefixName?string('', ', ')}"navigation_id" = :update_navigationId_value
<#assign prefixName = false>
</#if>
<#if (update_orderBy??)>
${prefixName?string('', ', ')}"order_by_" = :update_orderBy_value
<#assign prefixName = false>
</#if>
<#if (update_orgCode??)>
${prefixName?string('', ', ')}"org_code" = :update_orgCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentCode??)>
${prefixName?string('', ', ')}"parent_code" = :update_parentCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentId??)>
${prefixName?string('', ', ')}"parent_id" = :update_parentId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeCode??)>
${prefixName?string('', ', ')}"parent_tree_code" = :update_parentTreeCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeId??)>
${prefixName?string('', ', ')}"parent_tree_id" = :update_parentTreeId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeName??)>
${prefixName?string('', ', ')}"parent_tree_name" = :update_parentTreeName_value
<#assign prefixName = false>
</#if>
<#if (update_personalCode??)>
${prefixName?string('', ', ')}"personal_code" = :update_personalCode_value
<#assign prefixName = false>
</#if>
<#if (update_personalId??)>
${prefixName?string('', ', ')}"personal_id" = :update_personalId_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('', ', ')}"site_code" = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_stateCode??)>
${prefixName?string('', ', ')}"state_code" = :update_stateCode_value
<#assign prefixName = false>
</#if>
<#if (update_systemInfoCode??)>
${prefixName?string('', ', ')}"system_info_code" = :update_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (update_target??)>
${prefixName?string('', ', ')}"target" = :update_target_value
<#assign prefixName = false>
</#if>
<#if (update_typeCode??)>
${prefixName?string('', ', ')}"type_code" = :update_typeCode_value
<#assign prefixName = false>
</#if>
<#if (update_url??)>
${prefixName?string('', ', ')}"url" = :update_url_value
<#assign prefixName = false>
</#if>
<#if (update_version??)>
${prefixName?string('', ', ')}"version_" = :update_version_value
<#assign prefixName = false>
</#if>
