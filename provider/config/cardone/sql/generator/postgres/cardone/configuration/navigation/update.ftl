UPDATE "c1_navigation"
<#assign prefixName = true>
<#if (update_batchNo??)>
${prefixName?string('SET ', ', ')}"batch_no" = :update_batchNo_value
<#assign prefixName = false>
</#if>
<#if (update_beginDate??)>
${prefixName?string('SET ', ', ')}"begin_date" = :update_beginDate_value
<#assign prefixName = false>
</#if>
<#if (update_createdByCode??)>
${prefixName?string('SET ', ', ')}"created_by_code" = :update_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (update_createdById??)>
${prefixName?string('SET ', ', ')}"created_by_id" = :update_createdById_value
<#assign prefixName = false>
</#if>
<#if (update_createdDate??)>
${prefixName?string('SET ', ', ')}"created_date" = :update_createdDate_value
<#assign prefixName = false>
</#if>
<#if (update_dataOption??)>
${prefixName?string('SET ', ', ')}"data_option" = :update_dataOption_value
<#assign prefixName = false>
</#if>
<#if (update_dataStateCode??)>
${prefixName?string('SET ', ', ')}"data_state_code" = :update_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (update_departmentCode??)>
${prefixName?string('SET ', ', ')}"department_code" = :update_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (update_endDate??)>
${prefixName?string('SET ', ', ')}"end_date" = :update_endDate_value
<#assign prefixName = false>
</#if>
<#if (update_flagCode??)>
${prefixName?string('SET ', ', ')}"flag_code" = :update_flagCode_value
<#assign prefixName = false>
</#if>
<#if (update_flagObjectCode??)>
${prefixName?string('SET ', ', ')}"flag_object_code" = :update_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (update_iconStyle??)>
${prefixName?string('SET ', ', ')}"icon_style" = :update_iconStyle_value
<#assign prefixName = false>
</#if>
<#if (update_jsonData??)>
${prefixName?string('SET ', ', ')}"json_data" = :update_jsonData_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName?string('SET ', ', ')}"last_modified_by_code" = :update_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedById??)>
${prefixName?string('SET ', ', ')}"last_modified_by_id" = :update_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName?string('SET ', ', ')}"last_modified_date" = :update_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (update_name??)>
${prefixName?string('SET ', ', ')}"name" = :update_name_value
<#assign prefixName = false>
</#if>
<#if (update_navigationCode??)>
${prefixName?string('SET ', ', ')}"navigation_code" = :update_navigationCode_value
<#assign prefixName = false>
</#if>
<#if (update_navigationId??)>
${prefixName?string('SET ', ', ')}"navigation_id" = :update_navigationId_value
<#assign prefixName = false>
</#if>
<#if (update_orderBy??)>
${prefixName?string('SET ', ', ')}"order_by_" = :update_orderBy_value
<#assign prefixName = false>
</#if>
<#if (update_orgCode??)>
${prefixName?string('SET ', ', ')}"org_code" = :update_orgCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentCode??)>
${prefixName?string('SET ', ', ')}"parent_code" = :update_parentCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentId??)>
${prefixName?string('SET ', ', ')}"parent_id" = :update_parentId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeCode??)>
${prefixName?string('SET ', ', ')}"parent_tree_code" = :update_parentTreeCode_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeId??)>
${prefixName?string('SET ', ', ')}"parent_tree_id" = :update_parentTreeId_value
<#assign prefixName = false>
</#if>
<#if (update_parentTreeName??)>
${prefixName?string('SET ', ', ')}"parent_tree_name" = :update_parentTreeName_value
<#assign prefixName = false>
</#if>
<#if (update_personalCode??)>
${prefixName?string('SET ', ', ')}"personal_code" = :update_personalCode_value
<#assign prefixName = false>
</#if>
<#if (update_personalId??)>
${prefixName?string('SET ', ', ')}"personal_id" = :update_personalId_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('SET ', ', ')}"site_code" = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_stateCode??)>
${prefixName?string('SET ', ', ')}"state_code" = :update_stateCode_value
<#assign prefixName = false>
</#if>
<#if (update_systemInfoCode??)>
${prefixName?string('SET ', ', ')}"system_info_code" = :update_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (update_target??)>
${prefixName?string('SET ', ', ')}"target" = :update_target_value
<#assign prefixName = false>
</#if>
<#if (update_typeCode??)>
${prefixName?string('SET ', ', ')}"type_code" = :update_typeCode_value
<#assign prefixName = false>
</#if>
<#if (update_url??)>
${prefixName?string('SET ', ', ')}"url" = :update_url_value
<#assign prefixName = false>
</#if>
<#if (update_version??)>
${prefixName?string('SET ', ', ')}"version_" = :update_version_value
<#assign prefixName = false>
</#if>
<#include "where.ftl">