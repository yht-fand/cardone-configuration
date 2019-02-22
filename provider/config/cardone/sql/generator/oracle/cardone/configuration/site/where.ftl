<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}BATCH_NO = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(BATCH_NO IS NULL OR BATCH_NO = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}BEGIN_DATE = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}BEGIN_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_content??)>
<#if (where_and_eq_content_value??)>
${prefixName?string('WHERE ', 'AND ')}CONTENT = :where_and_eq_content_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CONTENT IS NULL OR CONTENT = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_BY_CODE = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CREATED_BY_CODE IS NULL OR CREATED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_BY_ID = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(CREATED_BY_ID IS NULL OR CREATED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}CREATED_DATE = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}CREATED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}DATA_STATE_CODE = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(DATA_STATE_CODE IS NULL OR DATA_STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}DEPARTMENT_CODE = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(DEPARTMENT_CODE IS NULL OR DEPARTMENT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}END_DATE = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}END_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_explain??)>
<#if (where_and_eq_explain_value??)>
${prefixName?string('WHERE ', 'AND ')}EXPLAIN_ = :where_and_eq_explain_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(EXPLAIN_ IS NULL OR EXPLAIN_ = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}FLAG_CODE = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FLAG_CODE IS NULL OR FLAG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}FLAG_OBJECT_CODE = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FLAG_OBJECT_CODE IS NULL OR FLAG_OBJECT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpIp??)>
<#if (where_and_eq_ftpIp_value??)>
${prefixName?string('WHERE ', 'AND ')}FTP_IP = :where_and_eq_ftpIp_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FTP_IP IS NULL OR FTP_IP = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPassword??)>
<#if (where_and_eq_ftpPassword_value??)>
${prefixName?string('WHERE ', 'AND ')}FTP_PASSWORD = :where_and_eq_ftpPassword_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FTP_PASSWORD IS NULL OR FTP_PASSWORD = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPort??)>
<#if (where_and_eq_ftpPort_value??)>
${prefixName?string('WHERE ', 'AND ')}FTP_PORT = :where_and_eq_ftpPort_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FTP_PORT IS NULL OR FTP_PORT = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpUsername??)>
<#if (where_and_eq_ftpUsername_value??)>
${prefixName?string('WHERE ', 'AND ')}FTP_USERNAME = :where_and_eq_ftpUsername_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(FTP_USERNAME IS NULL OR FTP_USERNAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}JSON_DATA = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}JSON_DATA IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_BY_CODE = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LAST_MODIFIED_BY_CODE IS NULL OR LAST_MODIFIED_BY_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_BY_ID = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LAST_MODIFIED_BY_ID IS NULL OR LAST_MODIFIED_BY_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_DATE = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}LAST_MODIFIED_DATE IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_latitude??)>
<#if (where_and_eq_latitude_value??)>
${prefixName?string('WHERE ', 'AND ')}LATITUDE = :where_and_eq_latitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LATITUDE IS NULL OR LATITUDE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_longitude??)>
<#if (where_and_eq_longitude_value??)>
${prefixName?string('WHERE ', 'AND ')}LONGITUDE = :where_and_eq_longitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(LONGITUDE IS NULL OR LONGITUDE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName?string('WHERE ', 'AND ')}NAME = :where_and_eq_name_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(NAME IS NULL OR NAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}ORDER_BY_ = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}ORDER_BY_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}ORG_CODE = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(ORG_CODE IS NULL OR ORG_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}PARENT_CODE = :where_and_eq_parentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PARENT_CODE IS NULL OR PARENT_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentId??)>
<#if (where_and_eq_parentId_value??)>
${prefixName?string('WHERE ', 'AND ')}PARENT_ID = :where_and_eq_parentId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PARENT_ID IS NULL OR PARENT_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}PARENT_TREE_CODE = :where_and_eq_parentTreeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PARENT_TREE_CODE IS NULL OR PARENT_TREE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeId??)>
<#if (where_and_eq_parentTreeId_value??)>
${prefixName?string('WHERE ', 'AND ')}PARENT_TREE_ID = :where_and_eq_parentTreeId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PARENT_TREE_ID IS NULL OR PARENT_TREE_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName?string('WHERE ', 'AND ')}PARENT_TREE_NAME = :where_and_eq_parentTreeName_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PARENT_TREE_NAME IS NULL OR PARENT_TREE_NAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}PERSONAL_CODE = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PERSONAL_CODE IS NULL OR PERSONAL_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}PERSONAL_ID = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(PERSONAL_ID IS NULL OR PERSONAL_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_postalCode??)>
<#if (where_and_eq_postalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}POSTAL_CODE = :where_and_eq_postalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(POSTAL_CODE IS NULL OR POSTAL_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_remark??)>
<#if (where_and_eq_remark_value??)>
${prefixName?string('WHERE ', 'AND ')}REMARK = :where_and_eq_remark_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(REMARK IS NULL OR REMARK = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SITE_CODE IS NULL OR SITE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteId??)>
<#if (where_and_eq_siteId_value??)>
${prefixName?string('WHERE ', 'AND ')}SITE_ID = :where_and_eq_siteId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SITE_ID IS NULL OR SITE_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}STATE_CODE = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(STATE_CODE IS NULL OR STATE_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}SYSTEM_INFO_CODE = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SYSTEM_INFO_CODE IS NULL OR SYSTEM_INFO_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoId??)>
<#if (where_and_eq_systemInfoId_value??)>
${prefixName?string('WHERE ', 'AND ')}SYSTEM_INFO_ID = :where_and_eq_systemInfoId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(SYSTEM_INFO_ID IS NULL OR SYSTEM_INFO_ID = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_url??)>
<#if (where_and_eq_url_value??)>
${prefixName?string('WHERE ', 'AND ')}URL = :where_and_eq_url_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(URL IS NULL OR URL = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}VERSION_ = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}VERSION_ IS NULL
</#if>
<#assign prefixName = false>
</#if>
