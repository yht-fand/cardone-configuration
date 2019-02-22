INSERT
INTO
C1_SITE
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
(SELECT
<#assign prefixName = true>
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
WHERE NOT EXISTS (SELECT 1 FROM C1_SITE E
<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}E.BATCH_NO = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.BATCH_NO IS NULL OR E.BATCH_NO = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E.BEGIN_DATE = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.BEGIN_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_content??)>
<#if (where_and_eq_content_value??)>
${prefixName?string('WHERE ', 'AND ')}E.CONTENT = :where_and_eq_content_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.CONTENT IS NULL OR E.CONTENT = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.CREATED_BY_CODE IS NULL OR E.CREATED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}E.CREATED_BY_ID = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.CREATED_BY_ID IS NULL OR E.CREATED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E.CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.CREATED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.DATA_STATE_CODE = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.DATA_STATE_CODE IS NULL OR E.DATA_STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.DEPARTMENT_CODE IS NULL OR E.DEPARTMENT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E.END_DATE = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.END_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_explain??)>
<#if (where_and_eq_explain_value??)>
${prefixName?string('WHERE ', 'AND ')}E.EXPLAIN_ = :where_and_eq_explain_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.EXPLAIN_ IS NULL OR E.EXPLAIN_ = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FLAG_CODE = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FLAG_CODE IS NULL OR E.FLAG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FLAG_OBJECT_CODE = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FLAG_OBJECT_CODE IS NULL OR E.FLAG_OBJECT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpIp??)>
<#if (where_and_eq_ftpIp_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FTP_IP = :where_and_eq_ftpIp_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FTP_IP IS NULL OR E.FTP_IP = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPassword??)>
<#if (where_and_eq_ftpPassword_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FTP_PASSWORD = :where_and_eq_ftpPassword_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FTP_PASSWORD IS NULL OR E.FTP_PASSWORD = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPort??)>
<#if (where_and_eq_ftpPort_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FTP_PORT = :where_and_eq_ftpPort_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FTP_PORT IS NULL OR E.FTP_PORT = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpUsername??)>
<#if (where_and_eq_ftpUsername_value??)>
${prefixName?string('WHERE ', 'AND ')}E.FTP_USERNAME = :where_and_eq_ftpUsername_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.FTP_USERNAME IS NULL OR E.FTP_USERNAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}E.JSON_DATA = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.JSON_DATA IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.LAST_MODIFIED_BY_CODE = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.LAST_MODIFIED_BY_CODE IS NULL OR E.LAST_MODIFIED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}E.LAST_MODIFIED_BY_ID = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.LAST_MODIFIED_BY_ID IS NULL OR E.LAST_MODIFIED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E.LAST_MODIFIED_DATE = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.LAST_MODIFIED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_latitude??)>
<#if (where_and_eq_latitude_value??)>
${prefixName?string('WHERE ', 'AND ')}E.LATITUDE = :where_and_eq_latitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.LATITUDE IS NULL OR E.LATITUDE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_longitude??)>
<#if (where_and_eq_longitude_value??)>
${prefixName?string('WHERE ', 'AND ')}E.LONGITUDE = :where_and_eq_longitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.LONGITUDE IS NULL OR E.LONGITUDE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName?string('WHERE ', 'AND ')}E.NAME = :where_and_eq_name_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.NAME IS NULL OR E.NAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}E.ORDER_BY_ = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.ORDER_BY_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.ORG_CODE IS NULL OR E.ORG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PARENT_CODE = :where_and_eq_parentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PARENT_CODE IS NULL OR E.PARENT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentId??)>
<#if (where_and_eq_parentId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PARENT_ID = :where_and_eq_parentId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PARENT_ID IS NULL OR E.PARENT_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PARENT_TREE_CODE = :where_and_eq_parentTreeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PARENT_TREE_CODE IS NULL OR E.PARENT_TREE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeId??)>
<#if (where_and_eq_parentTreeId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PARENT_TREE_ID = :where_and_eq_parentTreeId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PARENT_TREE_ID IS NULL OR E.PARENT_TREE_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PARENT_TREE_NAME = :where_and_eq_parentTreeName_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PARENT_TREE_NAME IS NULL OR E.PARENT_TREE_NAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PERSONAL_CODE = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PERSONAL_CODE IS NULL OR E.PERSONAL_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.PERSONAL_ID = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.PERSONAL_ID IS NULL OR E.PERSONAL_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_postalCode??)>
<#if (where_and_eq_postalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.POSTAL_CODE = :where_and_eq_postalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.POSTAL_CODE IS NULL OR E.POSTAL_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_remark??)>
<#if (where_and_eq_remark_value??)>
${prefixName?string('WHERE ', 'AND ')}E.REMARK = :where_and_eq_remark_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.REMARK IS NULL OR E.REMARK = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.SITE_CODE IS NULL OR E.SITE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteId??)>
<#if (where_and_eq_siteId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.SITE_ID = :where_and_eq_siteId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.SITE_ID IS NULL OR E.SITE_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.STATE_CODE = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.STATE_CODE IS NULL OR E.STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.SYSTEM_INFO_CODE = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.SYSTEM_INFO_CODE IS NULL OR E.SYSTEM_INFO_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoId??)>
<#if (where_and_eq_systemInfoId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.SYSTEM_INFO_ID = :where_and_eq_systemInfoId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.SYSTEM_INFO_ID IS NULL OR E.SYSTEM_INFO_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_url??)>
<#if (where_and_eq_url_value??)>
${prefixName?string('WHERE ', 'AND ')}E.URL = :where_and_eq_url_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.URL IS NULL OR E.URL = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}E.VERSION_ = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E.VERSION_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
))