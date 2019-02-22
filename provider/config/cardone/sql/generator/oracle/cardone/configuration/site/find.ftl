SELECT
<#assign prefixName = true>
<#if (select_batchNo??)>
${prefixName?string('  ', ', ')}BATCH_NO
<#assign prefixName = false>
</#if>
<#if (select_beginDate??)>
${prefixName?string('  ', ', ')}BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (select_content??)>
${prefixName?string('  ', ', ')}CONTENT
<#assign prefixName = false>
</#if>
<#if (select_createdByCode??)>
${prefixName?string('  ', ', ')}CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (select_createdById??)>
${prefixName?string('  ', ', ')}CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (select_createdDate??)>
${prefixName?string('  ', ', ')}CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (select_dataStateCode??)>
${prefixName?string('  ', ', ')}DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (select_departmentCode??)>
${prefixName?string('  ', ', ')}DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (select_endDate??)>
${prefixName?string('  ', ', ')}END_DATE
<#assign prefixName = false>
</#if>
<#if (select_explain??)>
${prefixName?string('  ', ', ')}EXPLAIN_
<#assign prefixName = false>
</#if>
<#if (select_flagCode??)>
${prefixName?string('  ', ', ')}FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (select_flagObjectCode??)>
${prefixName?string('  ', ', ')}FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (select_ftpIp??)>
${prefixName?string('  ', ', ')}FTP_IP
<#assign prefixName = false>
</#if>
<#if (select_ftpPassword??)>
${prefixName?string('  ', ', ')}FTP_PASSWORD
<#assign prefixName = false>
</#if>
<#if (select_ftpPort??)>
${prefixName?string('  ', ', ')}FTP_PORT
<#assign prefixName = false>
</#if>
<#if (select_ftpUsername??)>
${prefixName?string('  ', ', ')}FTP_USERNAME
<#assign prefixName = false>
</#if>
<#if (select_jsonData??)>
${prefixName?string('  ', ', ')}JSON_DATA
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedById??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (select_latitude??)>
${prefixName?string('  ', ', ')}LATITUDE
<#assign prefixName = false>
</#if>
<#if (select_longitude??)>
${prefixName?string('  ', ', ')}LONGITUDE
<#assign prefixName = false>
</#if>
<#if (select_name??)>
${prefixName?string('  ', ', ')}NAME
<#assign prefixName = false>
</#if>
<#if (select_orderBy??)>
${prefixName?string('  ', ', ')}ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (select_orgCode??)>
${prefixName?string('  ', ', ')}ORG_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentCode??)>
${prefixName?string('  ', ', ')}PARENT_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentId??)>
${prefixName?string('  ', ', ')}PARENT_ID
<#assign prefixName = false>
</#if>
<#if (select_parentTreeCode??)>
${prefixName?string('  ', ', ')}PARENT_TREE_CODE
<#assign prefixName = false>
</#if>
<#if (select_parentTreeId??)>
${prefixName?string('  ', ', ')}PARENT_TREE_ID
<#assign prefixName = false>
</#if>
<#if (select_parentTreeName??)>
${prefixName?string('  ', ', ')}PARENT_TREE_NAME
<#assign prefixName = false>
</#if>
<#if (select_personalCode??)>
${prefixName?string('  ', ', ')}PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (select_personalId??)>
${prefixName?string('  ', ', ')}PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (select_postalCode??)>
${prefixName?string('  ', ', ')}POSTAL_CODE
<#assign prefixName = false>
</#if>
<#if (select_remark??)>
${prefixName?string('  ', ', ')}REMARK
<#assign prefixName = false>
</#if>
<#if (select_siteCode??)>
${prefixName?string('  ', ', ')}SITE_CODE
<#assign prefixName = false>
</#if>
<#if (select_siteId??)>
${prefixName?string('  ', ', ')}SITE_ID
<#assign prefixName = false>
</#if>
<#if (select_stateCode??)>
${prefixName?string('  ', ', ')}STATE_CODE
<#assign prefixName = false>
</#if>
<#if (select_systemInfoCode??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (select_systemInfoId??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_ID
<#assign prefixName = false>
</#if>
<#if (select_url??)>
${prefixName?string('  ', ', ')}URL
<#assign prefixName = false>
</#if>
<#if (select_version??)>
${prefixName?string('  ', ', ')}VERSION_
<#assign prefixName = false>
</#if>
<#if prefixName>
*
</#if>
FROM C1_SITE
<#include "where.ftl">
<#assign prefixName = true>
<#if (order_by_batchNo??)>
${prefixName?string('ORDER BY ', ', ')}BATCH_NO ${order_by_batchNo_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_beginDate??)>
${prefixName?string('ORDER BY ', ', ')}BEGIN_DATE ${order_by_beginDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_content??)>
${prefixName?string('ORDER BY ', ', ')}CONTENT ${order_by_content_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdByCode??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_BY_CODE ${order_by_createdByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdById??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_BY_ID ${order_by_createdById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_createdDate??)>
${prefixName?string('ORDER BY ', ', ')}CREATED_DATE ${order_by_createdDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName?string('ORDER BY ', ', ')}DATA_STATE_CODE ${order_by_dataStateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_departmentCode??)>
${prefixName?string('ORDER BY ', ', ')}DEPARTMENT_CODE ${order_by_departmentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_endDate??)>
${prefixName?string('ORDER BY ', ', ')}END_DATE ${order_by_endDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_explain??)>
${prefixName?string('ORDER BY ', ', ')}EXPLAIN_ ${order_by_explain_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagCode??)>
${prefixName?string('ORDER BY ', ', ')}FLAG_CODE ${order_by_flagCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName?string('ORDER BY ', ', ')}FLAG_OBJECT_CODE ${order_by_flagObjectCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpIp??)>
${prefixName?string('ORDER BY ', ', ')}FTP_IP ${order_by_ftpIp_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpPassword??)>
${prefixName?string('ORDER BY ', ', ')}FTP_PASSWORD ${order_by_ftpPassword_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpPort??)>
${prefixName?string('ORDER BY ', ', ')}FTP_PORT ${order_by_ftpPort_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_ftpUsername??)>
${prefixName?string('ORDER BY ', ', ')}FTP_USERNAME ${order_by_ftpUsername_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_jsonData??)>
${prefixName?string('ORDER BY ', ', ')}JSON_DATA ${order_by_jsonData_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_BY_CODE ${order_by_lastModifiedByCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedById??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_BY_ID ${order_by_lastModifiedById_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName?string('ORDER BY ', ', ')}LAST_MODIFIED_DATE ${order_by_lastModifiedDate_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_latitude??)>
${prefixName?string('ORDER BY ', ', ')}LATITUDE ${order_by_latitude_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_longitude??)>
${prefixName?string('ORDER BY ', ', ')}LONGITUDE ${order_by_longitude_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_name??)>
${prefixName?string('ORDER BY ', ', ')}NAME ${order_by_name_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orderBy??)>
${prefixName?string('ORDER BY ', ', ')}ORDER_BY_ ${order_by_orderBy_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_orgCode??)>
${prefixName?string('ORDER BY ', ', ')}ORG_CODE ${order_by_orgCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentCode??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_CODE ${order_by_parentCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentId??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_ID ${order_by_parentId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_CODE ${order_by_parentTreeCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeId??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_ID ${order_by_parentTreeId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName?string('ORDER BY ', ', ')}PARENT_TREE_NAME ${order_by_parentTreeName_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalCode??)>
${prefixName?string('ORDER BY ', ', ')}PERSONAL_CODE ${order_by_personalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalId??)>
${prefixName?string('ORDER BY ', ', ')}PERSONAL_ID ${order_by_personalId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_postalCode??)>
${prefixName?string('ORDER BY ', ', ')}POSTAL_CODE ${order_by_postalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_remark??)>
${prefixName?string('ORDER BY ', ', ')}REMARK ${order_by_remark_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_siteCode??)>
${prefixName?string('ORDER BY ', ', ')}SITE_CODE ${order_by_siteCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_siteId??)>
${prefixName?string('ORDER BY ', ', ')}SITE_ID ${order_by_siteId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_stateCode??)>
${prefixName?string('ORDER BY ', ', ')}STATE_CODE ${order_by_stateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName?string('ORDER BY ', ', ')}SYSTEM_INFO_CODE ${order_by_systemInfoCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoId??)>
${prefixName?string('ORDER BY ', ', ')}SYSTEM_INFO_ID ${order_by_systemInfoId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_url??)>
${prefixName?string('ORDER BY ', ', ')}URL ${order_by_url_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_version??)>
${prefixName?string('ORDER BY ', ', ')}VERSION_ ${order_by_version_value!}
<#assign prefixName = false>
</#if>
