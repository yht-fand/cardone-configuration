INSERT
INTO
C1_NAVIGATION
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}BATCH_NO
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}BEGIN_DATE
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
<#if (insert_dataOption??) && (insert_dataOption_value??)>
${prefixName?string('  ', ', ')}DATA_OPTION
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
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}FLAG_CODE
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}FLAG_OBJECT_CODE
<#assign prefixName = false>
</#if>
<#if (insert_iconStyle??) && (insert_iconStyle_value??)>
${prefixName?string('  ', ', ')}ICON_STYLE
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
<#if (insert_name??) && (insert_name_value??)>
${prefixName?string('  ', ', ')}NAME
<#assign prefixName = false>
</#if>
<#if (insert_navigationCode??) && (insert_navigationCode_value??)>
${prefixName?string('  ', ', ')}NAVIGATION_CODE
<#assign prefixName = false>
</#if>
<#if (insert_navigationId??) && (insert_navigationId_value??)>
${prefixName?string('  ', ', ')}NAVIGATION_ID
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
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}SITE_CODE
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
<#if (insert_target??) && (insert_target_value??)>
${prefixName?string('  ', ', ')}TARGET
<#assign prefixName = false>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName?string('  ', ', ')}TYPE_CODE
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
<#if (insert_dataOption??) && (insert_dataOption_value??)>
${prefixName?string('  ', ', ')}:insert_dataOption_value
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
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagCode_value
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}:insert_flagObjectCode_value
<#assign prefixName = false>
</#if>
<#if (insert_iconStyle??) && (insert_iconStyle_value??)>
${prefixName?string('  ', ', ')}:insert_iconStyle_value
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
<#if (insert_name??) && (insert_name_value??)>
${prefixName?string('  ', ', ')}:insert_name_value
<#assign prefixName = false>
</#if>
<#if (insert_navigationCode??) && (insert_navigationCode_value??)>
${prefixName?string('  ', ', ')}:insert_navigationCode_value
<#assign prefixName = false>
</#if>
<#if (insert_navigationId??) && (insert_navigationId_value??)>
${prefixName?string('  ', ', ')}:insert_navigationId_value
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
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}:insert_siteCode_value
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
<#if (insert_target??) && (insert_target_value??)>
${prefixName?string('  ', ', ')}:insert_target_value
<#assign prefixName = false>
</#if>
<#if (insert_typeCode??) && (insert_typeCode_value??)>
${prefixName?string('  ', ', ')}:insert_typeCode_value
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
WHERE NOT EXISTS (SELECT 1 FROM C1_NAVIGATION E
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
<#if (where_and_eq_dataOption??)>
<#if (where_and_eq_dataOption_value??)>
${prefixName?string('WHERE ', 'AND ')}E.DATA_OPTION = :where_and_eq_dataOption_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.DATA_OPTION IS NULL OR E.DATA_OPTION = '')
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
<#if (where_and_eq_iconStyle??)>
<#if (where_and_eq_iconStyle_value??)>
${prefixName?string('WHERE ', 'AND ')}E.ICON_STYLE = :where_and_eq_iconStyle_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.ICON_STYLE IS NULL OR E.ICON_STYLE = '')
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
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName?string('WHERE ', 'AND ')}E.NAME = :where_and_eq_name_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.NAME IS NULL OR E.NAME = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_navigationCode??)>
<#if (where_and_eq_navigationCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.NAVIGATION_CODE = :where_and_eq_navigationCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.NAVIGATION_CODE IS NULL OR E.NAVIGATION_CODE = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_navigationId??)>
<#if (where_and_eq_navigationId_value??)>
${prefixName?string('WHERE ', 'AND ')}E.NAVIGATION_ID = :where_and_eq_navigationId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.NAVIGATION_ID IS NULL OR E.NAVIGATION_ID = '')
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
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.SITE_CODE = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.SITE_CODE IS NULL OR E.SITE_CODE = '')
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
<#if (where_and_eq_target??)>
<#if (where_and_eq_target_value??)>
${prefixName?string('WHERE ', 'AND ')}E.TARGET = :where_and_eq_target_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.TARGET IS NULL OR E.TARGET = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_typeCode??)>
<#if (where_and_eq_typeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E.TYPE_CODE = :where_and_eq_typeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E.TYPE_CODE IS NULL OR E.TYPE_CODE = '')
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