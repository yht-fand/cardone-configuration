<#include "insert.ftl">
on conflict (
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')}"batch_no"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')}"begin_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_content??)>
${prefixName?string('', ', ')}"content"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')}"created_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')}"created_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')}"created_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')}"data_state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')}"department_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')}"end_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_explain??)>
${prefixName?string('', ', ')}"explain_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')}"flag_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')}"flag_object_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_ftpIp??)>
${prefixName?string('', ', ')}"ftp_ip"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_ftpPassword??)>
${prefixName?string('', ', ')}"ftp_password"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_ftpPort??)>
${prefixName?string('', ', ')}"ftp_port"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_ftpUsername??)>
${prefixName?string('', ', ')}"ftp_username"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')}"json_data"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')}"last_modified_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')}"last_modified_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')}"last_modified_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_latitude??)>
${prefixName?string('', ', ')}"latitude"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_longitude??)>
${prefixName?string('', ', ')}"longitude"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_name??)>
${prefixName?string('', ', ')}"name"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')}"order_by_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')}"org_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_parentCode??)>
${prefixName?string('', ', ')}"parent_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_parentId??)>
${prefixName?string('', ', ')}"parent_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_parentTreeCode??)>
${prefixName?string('', ', ')}"parent_tree_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_parentTreeId??)>
${prefixName?string('', ', ')}"parent_tree_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_parentTreeName??)>
${prefixName?string('', ', ')}"parent_tree_name"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')}"personal_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')}"personal_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_postalCode??)>
${prefixName?string('', ', ')}"postal_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_remark??)>
${prefixName?string('', ', ')}"remark"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}"site_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_siteId??)>
${prefixName?string('', ', ')}"site_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')}"state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')}"system_info_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_systemInfoId??)>
${prefixName?string('', ', ')}"system_info_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_url??)>
${prefixName?string('', ', ')}"url"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')}"version_"
</#if>
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
<#if (update_content??)>
${prefixName?string('', ', ')}"content" = :update_content_value
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
<#if (update_explain??)>
${prefixName?string('', ', ')}"explain_" = :update_explain_value
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
<#if (update_ftpIp??)>
${prefixName?string('', ', ')}"ftp_ip" = :update_ftpIp_value
<#assign prefixName = false>
</#if>
<#if (update_ftpPassword??)>
${prefixName?string('', ', ')}"ftp_password" = :update_ftpPassword_value
<#assign prefixName = false>
</#if>
<#if (update_ftpPort??)>
${prefixName?string('', ', ')}"ftp_port" = :update_ftpPort_value
<#assign prefixName = false>
</#if>
<#if (update_ftpUsername??)>
${prefixName?string('', ', ')}"ftp_username" = :update_ftpUsername_value
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
<#if (update_latitude??)>
${prefixName?string('', ', ')}"latitude" = :update_latitude_value
<#assign prefixName = false>
</#if>
<#if (update_longitude??)>
${prefixName?string('', ', ')}"longitude" = :update_longitude_value
<#assign prefixName = false>
</#if>
<#if (update_name??)>
${prefixName?string('', ', ')}"name" = :update_name_value
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
<#if (update_postalCode??)>
${prefixName?string('', ', ')}"postal_code" = :update_postalCode_value
<#assign prefixName = false>
</#if>
<#if (update_remark??)>
${prefixName?string('', ', ')}"remark" = :update_remark_value
<#assign prefixName = false>
</#if>
<#if (update_siteCode??)>
${prefixName?string('', ', ')}"site_code" = :update_siteCode_value
<#assign prefixName = false>
</#if>
<#if (update_siteId??)>
${prefixName?string('', ', ')}"site_id" = :update_siteId_value
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
<#if (update_systemInfoId??)>
${prefixName?string('', ', ')}"system_info_id" = :update_systemInfoId_value
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
