INSERT
INTO C1_SITE
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}BATCH_NO
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}BEGIN_DATE
<#assign prefixName = false>
</#if>
<#if (insert_content??) && (insert_content_value??)>
${prefixName?string('  ', ', ')}CONTENT
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}CREATED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}CREATED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}CREATED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}DATA_STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}DEPARTMENT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}END_DATE
<#assign prefixName = false>
</#if>
<#if (insert_explain??) && (insert_explain_value??)>
${prefixName?string('  ', ', ')}EXPLAIN_
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_ftpIp??) && (insert_ftpIp_value??)>
${prefixName?string('  ', ', ')}FTP_IP
<#assign prefixName = false>
</#if>
<#if (insert_ftpPassword??) && (insert_ftpPassword_value??)>
${prefixName?string('  ', ', ')}FTP_PASSWORD
<#assign prefixName = false>
</#if>
<#if (insert_ftpPort??) && (insert_ftpPort_value??)>
${prefixName?string('  ', ', ')}FTP_PORT
<#assign prefixName = false>
</#if>
<#if (insert_ftpUsername??) && (insert_ftpUsername_value??)>
${prefixName?string('  ', ', ')}FTP_USERNAME
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}JSON_DATA
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_CODE
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_BY_ID
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}LAST_MODIFIED_DATE
<#assign prefixName = false>
</#if>
<#if (insert_latitude??) && (insert_latitude_value??)>
${prefixName?string('  ', ', ')}LATITUDE
<#assign prefixName = false>
</#if>
<#if (insert_longitude??) && (insert_longitude_value??)>
${prefixName?string('  ', ', ')}LONGITUDE
<#assign prefixName = false>
</#if>
<#if (insert_name??) && (insert_name_value??)>
${prefixName?string('  ', ', ')}NAME
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}ORDER_BY_
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}ORG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_parentCode??) && (insert_parentCode_value??)>
${prefixName?string('  ', ', ')}PARENT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_parentId??) && (insert_parentId_value??)>
${prefixName?string('  ', ', ')}PARENT_ID
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeCode??) && (insert_parentTreeCode_value??)>
${prefixName?string('  ', ', ')}PARENT_TREE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeId??) && (insert_parentTreeId_value??)>
${prefixName?string('  ', ', ')}PARENT_TREE_ID
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeName??) && (insert_parentTreeName_value??)>
${prefixName?string('  ', ', ')}PARENT_TREE_NAME
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}PERSONAL_CODE
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}PERSONAL_ID
<#assign prefixName = false>
</#if>
<#if (insert_postalCode??) && (insert_postalCode_value??)>
${prefixName?string('  ', ', ')}POSTAL_CODE
<#assign prefixName = false>
</#if>
<#if (insert_remark??) && (insert_remark_value??)>
${prefixName?string('  ', ', ')}REMARK
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}SITE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_siteId??) && (insert_siteId_value??)>
${prefixName?string('  ', ', ')}SITE_ID
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}STATE_CODE
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_CODE
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoId??) && (insert_systemInfoId_value??)>
${prefixName?string('  ', ', ')}SYSTEM_INFO_ID
<#assign prefixName = false>
</#if>
<#if (insert_url??) && (insert_url_value??)>
${prefixName?string('  ', ', ')}URL
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}VERSION_
<#assign prefixName = false>
</#if>
)
VALUES
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}:insert_batchNo_value
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}:insert_beginDate_value
<#assign prefixName = false>
</#if>
<#if (insert_content??) && (insert_content_value??)>
${prefixName?string('  ', ', ')}:insert_content_value
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}:insert_createdByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}:insert_createdById_value
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}:insert_createdDate_value
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}:insert_dataStateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}:insert_departmentCode_value
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}:insert_endDate_value
<#assign prefixName = false>
</#if>
<#if (insert_explain??) && (insert_explain_value??)>
${prefixName?string('  ', ', ')}:insert_explain_value
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagCode_value
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (insert_ftpIp??) && (insert_ftpIp_value??)>
${prefixName?string('  ', ', ')}:insert_ftpIp_value
<#assign prefixName = false>
</#if>
<#if (insert_ftpPassword??) && (insert_ftpPassword_value??)>
${prefixName?string('  ', ', ')}:insert_ftpPassword_value
<#assign prefixName = false>
</#if>
<#if (insert_ftpPort??) && (insert_ftpPort_value??)>
${prefixName?string('  ', ', ')}:insert_ftpPort_value
<#assign prefixName = false>
</#if>
<#if (insert_ftpUsername??) && (insert_ftpUsername_value??)>
${prefixName?string('  ', ', ')}:insert_ftpUsername_value
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}:insert_jsonData_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedByCode_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedById_value
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}:insert_lastModifiedDate_value
<#assign prefixName = false>
</#if>
<#if (insert_latitude??) && (insert_latitude_value??)>
${prefixName?string('  ', ', ')}:insert_latitude_value
<#assign prefixName = false>
</#if>
<#if (insert_longitude??) && (insert_longitude_value??)>
${prefixName?string('  ', ', ')}:insert_longitude_value
<#assign prefixName = false>
</#if>
<#if (insert_name??) && (insert_name_value??)>
${prefixName?string('  ', ', ')}:insert_name_value
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}:insert_orderBy_value
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}:insert_orgCode_value
<#assign prefixName = false>
</#if>
<#if (insert_parentCode??) && (insert_parentCode_value??)>
${prefixName?string('  ', ', ')}:insert_parentCode_value
<#assign prefixName = false>
</#if>
<#if (insert_parentId??) && (insert_parentId_value??)>
${prefixName?string('  ', ', ')}:insert_parentId_value
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeCode??) && (insert_parentTreeCode_value??)>
${prefixName?string('  ', ', ')}:insert_parentTreeCode_value
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeId??) && (insert_parentTreeId_value??)>
${prefixName?string('  ', ', ')}:insert_parentTreeId_value
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeName??) && (insert_parentTreeName_value??)>
${prefixName?string('  ', ', ')}:insert_parentTreeName_value
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}:insert_personalCode_value
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}:insert_personalId_value
<#assign prefixName = false>
</#if>
<#if (insert_postalCode??) && (insert_postalCode_value??)>
${prefixName?string('  ', ', ')}:insert_postalCode_value
<#assign prefixName = false>
</#if>
<#if (insert_remark??) && (insert_remark_value??)>
${prefixName?string('  ', ', ')}:insert_remark_value
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}:insert_siteCode_value
<#assign prefixName = false>
</#if>
<#if (insert_siteId??) && (insert_siteId_value??)>
${prefixName?string('  ', ', ')}:insert_siteId_value
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}:insert_stateCode_value
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}:insert_systemInfoCode_value
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoId??) && (insert_systemInfoId_value??)>
${prefixName?string('  ', ', ')}:insert_systemInfoId_value
<#assign prefixName = false>
</#if>
<#if (insert_url??) && (insert_url_value??)>
${prefixName?string('  ', ', ')}:insert_url_value
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}:insert_version_value
<#assign prefixName = false>
</#if>
)