SELECT
<#assign prefixName = true>
<#if (select_batchNo??)>
${prefixName?string('  ', ', ')}"batch_no"
<#assign prefixName = false>
</#if>
<#if (select_beginDate??)>
${prefixName?string('  ', ', ')}"begin_date"
<#assign prefixName = false>
</#if>
<#if (select_content??)>
${prefixName?string('  ', ', ')}"content"
<#assign prefixName = false>
</#if>
<#if (select_createdByCode??)>
${prefixName?string('  ', ', ')}"created_by_code"
<#assign prefixName = false>
</#if>
<#if (select_createdById??)>
${prefixName?string('  ', ', ')}"created_by_id"
<#assign prefixName = false>
</#if>
<#if (select_createdDate??)>
${prefixName?string('  ', ', ')}"created_date"
<#assign prefixName = false>
</#if>
<#if (select_dataStateCode??)>
${prefixName?string('  ', ', ')}"data_state_code"
<#assign prefixName = false>
</#if>
<#if (select_departmentCode??)>
${prefixName?string('  ', ', ')}"department_code"
<#assign prefixName = false>
</#if>
<#if (select_endDate??)>
${prefixName?string('  ', ', ')}"end_date"
<#assign prefixName = false>
</#if>
<#if (select_explain??)>
${prefixName?string('  ', ', ')}"explain_"
<#assign prefixName = false>
</#if>
<#if (select_flagCode??)>
${prefixName?string('  ', ', ')}"flag_code"
<#assign prefixName = false>
</#if>
<#if (select_flagObjectCode??)>
${prefixName?string('  ', ', ')}"flag_object_code"
<#assign prefixName = false>
</#if>
<#if (select_ftpIp??)>
${prefixName?string('  ', ', ')}"ftp_ip"
<#assign prefixName = false>
</#if>
<#if (select_ftpPassword??)>
${prefixName?string('  ', ', ')}"ftp_password"
<#assign prefixName = false>
</#if>
<#if (select_ftpPort??)>
${prefixName?string('  ', ', ')}"ftp_port"
<#assign prefixName = false>
</#if>
<#if (select_ftpUsername??)>
${prefixName?string('  ', ', ')}"ftp_username"
<#assign prefixName = false>
</#if>
<#if (select_jsonData??)>
${prefixName?string('  ', ', ')}"json_data"
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName?string('  ', ', ')}"last_modified_by_code"
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedById??)>
${prefixName?string('  ', ', ')}"last_modified_by_id"
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName?string('  ', ', ')}"last_modified_date"
<#assign prefixName = false>
</#if>
<#if (select_latitude??)>
${prefixName?string('  ', ', ')}"latitude"
<#assign prefixName = false>
</#if>
<#if (select_longitude??)>
${prefixName?string('  ', ', ')}"longitude"
<#assign prefixName = false>
</#if>
<#if (select_name??)>
${prefixName?string('  ', ', ')}"name"
<#assign prefixName = false>
</#if>
<#if (select_orderBy??)>
${prefixName?string('  ', ', ')}"order_by_"
<#assign prefixName = false>
</#if>
<#if (select_orgCode??)>
${prefixName?string('  ', ', ')}"org_code"
<#assign prefixName = false>
</#if>
<#if (select_parentCode??)>
${prefixName?string('  ', ', ')}"parent_code"
<#assign prefixName = false>
</#if>
<#if (select_parentId??)>
${prefixName?string('  ', ', ')}"parent_id"
<#assign prefixName = false>
</#if>
<#if (select_parentTreeCode??)>
${prefixName?string('  ', ', ')}"parent_tree_code"
<#assign prefixName = false>
</#if>
<#if (select_parentTreeId??)>
${prefixName?string('  ', ', ')}"parent_tree_id"
<#assign prefixName = false>
</#if>
<#if (select_parentTreeName??)>
${prefixName?string('  ', ', ')}"parent_tree_name"
<#assign prefixName = false>
</#if>
<#if (select_personalCode??)>
${prefixName?string('  ', ', ')}"personal_code"
<#assign prefixName = false>
</#if>
<#if (select_personalId??)>
${prefixName?string('  ', ', ')}"personal_id"
<#assign prefixName = false>
</#if>
<#if (select_postalCode??)>
${prefixName?string('  ', ', ')}"postal_code"
<#assign prefixName = false>
</#if>
<#if (select_remark??)>
${prefixName?string('  ', ', ')}"remark"
<#assign prefixName = false>
</#if>
<#if (select_siteCode??)>
${prefixName?string('  ', ', ')}"site_code"
<#assign prefixName = false>
</#if>
<#if (select_siteId??)>
${prefixName?string('  ', ', ')}"site_id"
<#assign prefixName = false>
</#if>
<#if (select_stateCode??)>
${prefixName?string('  ', ', ')}"state_code"
<#assign prefixName = false>
</#if>
<#if (select_systemInfoCode??)>
${prefixName?string('  ', ', ')}"system_info_code"
<#assign prefixName = false>
</#if>
<#if (select_systemInfoId??)>
${prefixName?string('  ', ', ')}"system_info_id"
<#assign prefixName = false>
</#if>
<#if (select_url??)>
${prefixName?string('  ', ', ')}"url"
<#assign prefixName = false>
</#if>
<#if (select_version??)>
${prefixName?string('  ', ', ')}"version_"
<#assign prefixName = false>
</#if>
<#if prefixName>
*
</#if>
FROM "c1_site"
<#include "where.ftl">
<#assign prefixName = true>
<#if (order_by_batchNo??)>
${prefixName?string('ORDER BY ', ', ')}"batch_no" ${order_by_batchNo_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_beginDate??)>
${prefixName?string('ORDER BY ', ', ')}"begin_date" ${order_by_beginDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_content??)>
${prefixName?string('ORDER BY ', ', ')}"content" ${order_by_content_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdByCode??)>
${prefixName?string('ORDER BY ', ', ')}"created_by_code" ${order_by_createdByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdById??)>
${prefixName?string('ORDER BY ', ', ')}"created_by_id" ${order_by_createdById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdDate??)>
${prefixName?string('ORDER BY ', ', ')}"created_date" ${order_by_createdDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName?string('ORDER BY ', ', ')}"data_state_code" ${order_by_dataStateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_departmentCode??)>
${prefixName?string('ORDER BY ', ', ')}"department_code" ${order_by_departmentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_endDate??)>
${prefixName?string('ORDER BY ', ', ')}"end_date" ${order_by_endDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_explain??)>
${prefixName?string('ORDER BY ', ', ')}"explain_" ${order_by_explain_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagCode??)>
${prefixName?string('ORDER BY ', ', ')}"flag_code" ${order_by_flagCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName?string('ORDER BY ', ', ')}"flag_object_code" ${order_by_flagObjectCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpIp??)>
${prefixName?string('ORDER BY ', ', ')}"ftp_ip" ${order_by_ftpIp_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpPassword??)>
${prefixName?string('ORDER BY ', ', ')}"ftp_password" ${order_by_ftpPassword_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpPort??)>
${prefixName?string('ORDER BY ', ', ')}"ftp_port" ${order_by_ftpPort_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpUsername??)>
${prefixName?string('ORDER BY ', ', ')}"ftp_username" ${order_by_ftpUsername_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_jsonData??)>
${prefixName?string('ORDER BY ', ', ')}"json_data" ${order_by_jsonData_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName?string('ORDER BY ', ', ')}"last_modified_by_code" ${order_by_lastModifiedByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedById??)>
${prefixName?string('ORDER BY ', ', ')}"last_modified_by_id" ${order_by_lastModifiedById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName?string('ORDER BY ', ', ')}"last_modified_date" ${order_by_lastModifiedDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_latitude??)>
${prefixName?string('ORDER BY ', ', ')}"latitude" ${order_by_latitude_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_longitude??)>
${prefixName?string('ORDER BY ', ', ')}"longitude" ${order_by_longitude_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_name??)>
${prefixName?string('ORDER BY ', ', ')}"name" ${order_by_name_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orderBy??)>
${prefixName?string('ORDER BY ', ', ')}"order_by_" ${order_by_orderBy_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orgCode??)>
${prefixName?string('ORDER BY ', ', ')}"org_code" ${order_by_orgCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentCode??)>
${prefixName?string('ORDER BY ', ', ')}"parent_code" ${order_by_parentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentId??)>
${prefixName?string('ORDER BY ', ', ')}"parent_id" ${order_by_parentId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName?string('ORDER BY ', ', ')}"parent_tree_code" ${order_by_parentTreeCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeId??)>
${prefixName?string('ORDER BY ', ', ')}"parent_tree_id" ${order_by_parentTreeId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName?string('ORDER BY ', ', ')}"parent_tree_name" ${order_by_parentTreeName_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalCode??)>
${prefixName?string('ORDER BY ', ', ')}"personal_code" ${order_by_personalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalId??)>
${prefixName?string('ORDER BY ', ', ')}"personal_id" ${order_by_personalId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_postalCode??)>
${prefixName?string('ORDER BY ', ', ')}"postal_code" ${order_by_postalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_remark??)>
${prefixName?string('ORDER BY ', ', ')}"remark" ${order_by_remark_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_siteCode??)>
${prefixName?string('ORDER BY ', ', ')}"site_code" ${order_by_siteCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_siteId??)>
${prefixName?string('ORDER BY ', ', ')}"site_id" ${order_by_siteId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_stateCode??)>
${prefixName?string('ORDER BY ', ', ')}"state_code" ${order_by_stateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName?string('ORDER BY ', ', ')}"system_info_code" ${order_by_systemInfoCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoId??)>
${prefixName?string('ORDER BY ', ', ')}"system_info_id" ${order_by_systemInfoId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_url??)>
${prefixName?string('ORDER BY ', ', ')}"url" ${order_by_url_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_version??)>
${prefixName?string('ORDER BY ', ', ')}"version_" ${order_by_version_value!}
<#assign prefixName = false>
</#if>
