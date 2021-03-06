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
<#if (index_content??)>
${prefixName?string('', ', ')}"content"
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
<#if (index_explain??)>
${prefixName?string('', ', ')}"explain_"
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
<#if (index_ftpIp??)>
${prefixName?string('', ', ')}"ftp_ip"
<#assign prefixName = false>
</#if>
<#if (index_ftpPassword??)>
${prefixName?string('', ', ')}"ftp_password"
<#assign prefixName = false>
</#if>
<#if (index_ftpPort??)>
${prefixName?string('', ', ')}"ftp_port"
<#assign prefixName = false>
</#if>
<#if (index_ftpUsername??)>
${prefixName?string('', ', ')}"ftp_username"
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
<#if (index_latitude??)>
${prefixName?string('', ', ')}"latitude"
<#assign prefixName = false>
</#if>
<#if (index_longitude??)>
${prefixName?string('', ', ')}"longitude"
<#assign prefixName = false>
</#if>
<#if (index_name??)>
${prefixName?string('', ', ')}"name"
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
<#if (index_postalCode??)>
${prefixName?string('', ', ')}"postal_code"
<#assign prefixName = false>
</#if>
<#if (index_remark??)>
${prefixName?string('', ', ')}"remark"
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}"site_code"
<#assign prefixName = false>
</#if>
<#if (index_siteId??)>
${prefixName?string('', ', ')}"site_id"
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
<#if (index_systemInfoId??)>
${prefixName?string('', ', ')}"system_info_id"
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
) do nothing