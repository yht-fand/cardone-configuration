INSERT
INTO
"c1_site"
(<#assign prefixName = true>
<#if (insert_batchNo??) && (insert_batchNo_value??)>
${prefixName?string('  ', ', ')}"batch_no"
<#assign prefixName = false>
</#if>
<#if (insert_beginDate??) && (insert_beginDate_value??)>
${prefixName?string('  ', ', ')}"begin_date"
<#assign prefixName = false>
</#if>
<#if (insert_content??) && (insert_content_value??)>
${prefixName?string('  ', ', ')}"content"
<#assign prefixName = false>
</#if>
<#if (insert_createdByCode??) && (insert_createdByCode_value??)>
${prefixName?string('  ', ', ')}"created_by_code"
<#assign prefixName = false>
</#if>
<#if (insert_createdById??) && (insert_createdById_value??)>
${prefixName?string('  ', ', ')}"created_by_id"
<#assign prefixName = false>
</#if>
<#if (insert_createdDate??) && (insert_createdDate_value??)>
${prefixName?string('  ', ', ')}"created_date"
<#assign prefixName = false>
</#if>
<#if (insert_dataStateCode??) && (insert_dataStateCode_value??)>
${prefixName?string('  ', ', ')}"data_state_code"
<#assign prefixName = false>
</#if>
<#if (insert_departmentCode??) && (insert_departmentCode_value??)>
${prefixName?string('  ', ', ')}"department_code"
<#assign prefixName = false>
</#if>
<#if (insert_endDate??) && (insert_endDate_value??)>
${prefixName?string('  ', ', ')}"end_date"
<#assign prefixName = false>
</#if>
<#if (insert_explain??) && (insert_explain_value??)>
${prefixName?string('  ', ', ')}"explain_"
<#assign prefixName = false>
</#if>
<#if (insert_flagCode??) && (insert_flagCode_value??)>
${prefixName?string('  ', ', ')}"flag_code"
<#assign prefixName = false>
</#if>
<#if (insert_flagObjectCode??) && (insert_flagObjectCode_value??)>
${prefixName?string('  ', ', ')}"flag_object_code"
<#assign prefixName = false>
</#if>
<#if (insert_ftpIp??) && (insert_ftpIp_value??)>
${prefixName?string('  ', ', ')}"ftp_ip"
<#assign prefixName = false>
</#if>
<#if (insert_ftpPassword??) && (insert_ftpPassword_value??)>
${prefixName?string('  ', ', ')}"ftp_password"
<#assign prefixName = false>
</#if>
<#if (insert_ftpPort??) && (insert_ftpPort_value??)>
${prefixName?string('  ', ', ')}"ftp_port"
<#assign prefixName = false>
</#if>
<#if (insert_ftpUsername??) && (insert_ftpUsername_value??)>
${prefixName?string('  ', ', ')}"ftp_username"
<#assign prefixName = false>
</#if>
<#if (insert_jsonData??) && (insert_jsonData_value??)>
${prefixName?string('  ', ', ')}"json_data"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedByCode??) && (insert_lastModifiedByCode_value??)>
${prefixName?string('  ', ', ')}"last_modified_by_code"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedById??) && (insert_lastModifiedById_value??)>
${prefixName?string('  ', ', ')}"last_modified_by_id"
<#assign prefixName = false>
</#if>
<#if (insert_lastModifiedDate??) && (insert_lastModifiedDate_value??)>
${prefixName?string('  ', ', ')}"last_modified_date"
<#assign prefixName = false>
</#if>
<#if (insert_latitude??) && (insert_latitude_value??)>
${prefixName?string('  ', ', ')}"latitude"
<#assign prefixName = false>
</#if>
<#if (insert_longitude??) && (insert_longitude_value??)>
${prefixName?string('  ', ', ')}"longitude"
<#assign prefixName = false>
</#if>
<#if (insert_name??) && (insert_name_value??)>
${prefixName?string('  ', ', ')}"name"
<#assign prefixName = false>
</#if>
<#if (insert_orderBy??) && (insert_orderBy_value??)>
${prefixName?string('  ', ', ')}"order_by_"
<#assign prefixName = false>
</#if>
<#if (insert_orgCode??) && (insert_orgCode_value??)>
${prefixName?string('  ', ', ')}"org_code"
<#assign prefixName = false>
</#if>
<#if (insert_parentCode??) && (insert_parentCode_value??)>
${prefixName?string('  ', ', ')}"parent_code"
<#assign prefixName = false>
</#if>
<#if (insert_parentId??) && (insert_parentId_value??)>
${prefixName?string('  ', ', ')}"parent_id"
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeCode??) && (insert_parentTreeCode_value??)>
${prefixName?string('  ', ', ')}"parent_tree_code"
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeId??) && (insert_parentTreeId_value??)>
${prefixName?string('  ', ', ')}"parent_tree_id"
<#assign prefixName = false>
</#if>
<#if (insert_parentTreeName??) && (insert_parentTreeName_value??)>
${prefixName?string('  ', ', ')}"parent_tree_name"
<#assign prefixName = false>
</#if>
<#if (insert_personalCode??) && (insert_personalCode_value??)>
${prefixName?string('  ', ', ')}"personal_code"
<#assign prefixName = false>
</#if>
<#if (insert_personalId??) && (insert_personalId_value??)>
${prefixName?string('  ', ', ')}"personal_id"
<#assign prefixName = false>
</#if>
<#if (insert_postalCode??) && (insert_postalCode_value??)>
${prefixName?string('  ', ', ')}"postal_code"
<#assign prefixName = false>
</#if>
<#if (insert_remark??) && (insert_remark_value??)>
${prefixName?string('  ', ', ')}"remark"
<#assign prefixName = false>
</#if>
<#if (insert_siteCode??) && (insert_siteCode_value??)>
${prefixName?string('  ', ', ')}"site_code"
<#assign prefixName = false>
</#if>
<#if (insert_siteId??) && (insert_siteId_value??)>
${prefixName?string('  ', ', ')}"site_id"
<#assign prefixName = false>
</#if>
<#if (insert_stateCode??) && (insert_stateCode_value??)>
${prefixName?string('  ', ', ')}"state_code"
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoCode??) && (insert_systemInfoCode_value??)>
${prefixName?string('  ', ', ')}"system_info_code"
<#assign prefixName = false>
</#if>
<#if (insert_systemInfoId??) && (insert_systemInfoId_value??)>
${prefixName?string('  ', ', ')}"system_info_id"
<#assign prefixName = false>
</#if>
<#if (insert_url??) && (insert_url_value??)>
${prefixName?string('  ', ', ')}"url"
<#assign prefixName = false>
</#if>
<#if (insert_version??) && (insert_version_value??)>
${prefixName?string('  ', ', ')}"version_"
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
WHERE NOT EXISTS (SELECT 1 FROM "c1_site" E
<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}E."batch_no" = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."batch_no" IS NULL OR E."batch_no" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."begin_date" = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."begin_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_content??)>
<#if (where_and_eq_content_value??)>
${prefixName?string('WHERE ', 'AND ')}E."content" = :where_and_eq_content_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."content" IS NULL OR E."content" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_by_code" = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."created_by_code" IS NULL OR E."created_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_by_id" = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."created_by_id" IS NULL OR E."created_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."created_date" = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."created_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."data_state_code" = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."data_state_code" IS NULL OR E."data_state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."department_code" = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."department_code" IS NULL OR E."department_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."end_date" = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."end_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_explain??)>
<#if (where_and_eq_explain_value??)>
${prefixName?string('WHERE ', 'AND ')}E."explain_" = :where_and_eq_explain_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."explain_" IS NULL OR E."explain_" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."flag_code" = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."flag_code" IS NULL OR E."flag_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."flag_object_code" = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."flag_object_code" IS NULL OR E."flag_object_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpIp??)>
<#if (where_and_eq_ftpIp_value??)>
${prefixName?string('WHERE ', 'AND ')}E."ftp_ip" = :where_and_eq_ftpIp_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."ftp_ip" IS NULL OR E."ftp_ip" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPassword??)>
<#if (where_and_eq_ftpPassword_value??)>
${prefixName?string('WHERE ', 'AND ')}E."ftp_password" = :where_and_eq_ftpPassword_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."ftp_password" IS NULL OR E."ftp_password" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPort??)>
<#if (where_and_eq_ftpPort_value??)>
${prefixName?string('WHERE ', 'AND ')}E."ftp_port" = :where_and_eq_ftpPort_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."ftp_port" IS NULL OR E."ftp_port" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpUsername??)>
<#if (where_and_eq_ftpUsername_value??)>
${prefixName?string('WHERE ', 'AND ')}E."ftp_username" = :where_and_eq_ftpUsername_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."ftp_username" IS NULL OR E."ftp_username" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}E."json_data" = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."json_data" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_by_code" = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."last_modified_by_code" IS NULL OR E."last_modified_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_by_id" = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."last_modified_by_id" IS NULL OR E."last_modified_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_date" = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."last_modified_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_latitude??)>
<#if (where_and_eq_latitude_value??)>
${prefixName?string('WHERE ', 'AND ')}E."latitude" = :where_and_eq_latitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."latitude" IS NULL OR E."latitude" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_longitude??)>
<#if (where_and_eq_longitude_value??)>
${prefixName?string('WHERE ', 'AND ')}E."longitude" = :where_and_eq_longitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."longitude" IS NULL OR E."longitude" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName?string('WHERE ', 'AND ')}E."name" = :where_and_eq_name_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."name" IS NULL OR E."name" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}E."order_by_" = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."order_by_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."org_code" = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."org_code" IS NULL OR E."org_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."parent_code" = :where_and_eq_parentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."parent_code" IS NULL OR E."parent_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentId??)>
<#if (where_and_eq_parentId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."parent_id" = :where_and_eq_parentId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."parent_id" IS NULL OR E."parent_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."parent_tree_code" = :where_and_eq_parentTreeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."parent_tree_code" IS NULL OR E."parent_tree_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeId??)>
<#if (where_and_eq_parentTreeId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."parent_tree_id" = :where_and_eq_parentTreeId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."parent_tree_id" IS NULL OR E."parent_tree_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName?string('WHERE ', 'AND ')}E."parent_tree_name" = :where_and_eq_parentTreeName_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."parent_tree_name" IS NULL OR E."parent_tree_name" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."personal_code" = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."personal_code" IS NULL OR E."personal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."personal_id" = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."personal_id" IS NULL OR E."personal_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_postalCode??)>
<#if (where_and_eq_postalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."postal_code" = :where_and_eq_postalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."postal_code" IS NULL OR E."postal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_remark??)>
<#if (where_and_eq_remark_value??)>
${prefixName?string('WHERE ', 'AND ')}E."remark" = :where_and_eq_remark_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."remark" IS NULL OR E."remark" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."site_code" = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."site_code" IS NULL OR E."site_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteId??)>
<#if (where_and_eq_siteId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."site_id" = :where_and_eq_siteId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."site_id" IS NULL OR E."site_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."state_code" = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."state_code" IS NULL OR E."state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}E."system_info_code" = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."system_info_code" IS NULL OR E."system_info_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoId??)>
<#if (where_and_eq_systemInfoId_value??)>
${prefixName?string('WHERE ', 'AND ')}E."system_info_id" = :where_and_eq_systemInfoId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."system_info_id" IS NULL OR E."system_info_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_url??)>
<#if (where_and_eq_url_value??)>
${prefixName?string('WHERE ', 'AND ')}E."url" = :where_and_eq_url_value
<#else>
${prefixName?string('WHERE ', 'AND ')}(E."url" IS NULL OR E."url" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}E."version_" = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}E."version_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
))