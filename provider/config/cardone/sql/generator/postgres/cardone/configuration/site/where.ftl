<#assign prefixName = true>
<#if (where_and_eq_batchNo??)>
<#if (where_and_eq_batchNo_value??)>
${prefixName?string('WHERE ', 'AND ')}"batch_no" = :where_and_eq_batchNo_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("batch_no" IS NULL OR "batch_no" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_beginDate??)>
<#if (where_and_eq_beginDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"begin_date" = :where_and_eq_beginDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"begin_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_content??)>
<#if (where_and_eq_content_value??)>
${prefixName?string('WHERE ', 'AND ')}"content" = :where_and_eq_content_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("content" IS NULL OR "content" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdByCode??)>
<#if (where_and_eq_createdByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_by_code" = :where_and_eq_createdByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("created_by_code" IS NULL OR "created_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdById??)>
<#if (where_and_eq_createdById_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_by_id" = :where_and_eq_createdById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("created_by_id" IS NULL OR "created_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_createdDate??)>
<#if (where_and_eq_createdDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"created_date" = :where_and_eq_createdDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"created_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_dataStateCode??)>
<#if (where_and_eq_dataStateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"data_state_code" = :where_and_eq_dataStateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("data_state_code" IS NULL OR "data_state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_departmentCode??)>
<#if (where_and_eq_departmentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"department_code" = :where_and_eq_departmentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("department_code" IS NULL OR "department_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_endDate??)>
<#if (where_and_eq_endDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"end_date" = :where_and_eq_endDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"end_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_explain??)>
<#if (where_and_eq_explain_value??)>
${prefixName?string('WHERE ', 'AND ')}"explain_" = :where_and_eq_explain_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("explain_" IS NULL OR "explain_" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagCode??)>
<#if (where_and_eq_flagCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"flag_code" = :where_and_eq_flagCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("flag_code" IS NULL OR "flag_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_flagObjectCode??)>
<#if (where_and_eq_flagObjectCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"flag_object_code" = :where_and_eq_flagObjectCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("flag_object_code" IS NULL OR "flag_object_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpIp??)>
<#if (where_and_eq_ftpIp_value??)>
${prefixName?string('WHERE ', 'AND ')}"ftp_ip" = :where_and_eq_ftpIp_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("ftp_ip" IS NULL OR "ftp_ip" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPassword??)>
<#if (where_and_eq_ftpPassword_value??)>
${prefixName?string('WHERE ', 'AND ')}"ftp_password" = :where_and_eq_ftpPassword_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("ftp_password" IS NULL OR "ftp_password" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpPort??)>
<#if (where_and_eq_ftpPort_value??)>
${prefixName?string('WHERE ', 'AND ')}"ftp_port" = :where_and_eq_ftpPort_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("ftp_port" IS NULL OR "ftp_port" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_ftpUsername??)>
<#if (where_and_eq_ftpUsername_value??)>
${prefixName?string('WHERE ', 'AND ')}"ftp_username" = :where_and_eq_ftpUsername_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("ftp_username" IS NULL OR "ftp_username" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_jsonData??)>
<#if (where_and_eq_jsonData_value??)>
${prefixName?string('WHERE ', 'AND ')}"json_data" = :where_and_eq_jsonData_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"json_data" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedByCode??)>
<#if (where_and_eq_lastModifiedByCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_by_code" = :where_and_eq_lastModifiedByCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("last_modified_by_code" IS NULL OR "last_modified_by_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedById??)>
<#if (where_and_eq_lastModifiedById_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_by_id" = :where_and_eq_lastModifiedById_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("last_modified_by_id" IS NULL OR "last_modified_by_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_lastModifiedDate??)>
<#if (where_and_eq_lastModifiedDate_value??)>
${prefixName?string('WHERE ', 'AND ')}"last_modified_date" = :where_and_eq_lastModifiedDate_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"last_modified_date" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_latitude??)>
<#if (where_and_eq_latitude_value??)>
${prefixName?string('WHERE ', 'AND ')}"latitude" = :where_and_eq_latitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("latitude" IS NULL OR "latitude" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_longitude??)>
<#if (where_and_eq_longitude_value??)>
${prefixName?string('WHERE ', 'AND ')}"longitude" = :where_and_eq_longitude_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("longitude" IS NULL OR "longitude" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_name??)>
<#if (where_and_eq_name_value??)>
${prefixName?string('WHERE ', 'AND ')}"name" = :where_and_eq_name_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("name" IS NULL OR "name" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orderBy??)>
<#if (where_and_eq_orderBy_value??)>
${prefixName?string('WHERE ', 'AND ')}"order_by_" = :where_and_eq_orderBy_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"order_by_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_orgCode??)>
<#if (where_and_eq_orgCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"org_code" = :where_and_eq_orgCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("org_code" IS NULL OR "org_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentCode??)>
<#if (where_and_eq_parentCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"parent_code" = :where_and_eq_parentCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("parent_code" IS NULL OR "parent_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentId??)>
<#if (where_and_eq_parentId_value??)>
${prefixName?string('WHERE ', 'AND ')}"parent_id" = :where_and_eq_parentId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("parent_id" IS NULL OR "parent_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeCode??)>
<#if (where_and_eq_parentTreeCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"parent_tree_code" = :where_and_eq_parentTreeCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("parent_tree_code" IS NULL OR "parent_tree_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeId??)>
<#if (where_and_eq_parentTreeId_value??)>
${prefixName?string('WHERE ', 'AND ')}"parent_tree_id" = :where_and_eq_parentTreeId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("parent_tree_id" IS NULL OR "parent_tree_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_parentTreeName??)>
<#if (where_and_eq_parentTreeName_value??)>
${prefixName?string('WHERE ', 'AND ')}"parent_tree_name" = :where_and_eq_parentTreeName_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("parent_tree_name" IS NULL OR "parent_tree_name" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalCode??)>
<#if (where_and_eq_personalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"personal_code" = :where_and_eq_personalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("personal_code" IS NULL OR "personal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_personalId??)>
<#if (where_and_eq_personalId_value??)>
${prefixName?string('WHERE ', 'AND ')}"personal_id" = :where_and_eq_personalId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("personal_id" IS NULL OR "personal_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_postalCode??)>
<#if (where_and_eq_postalCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"postal_code" = :where_and_eq_postalCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("postal_code" IS NULL OR "postal_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_remark??)>
<#if (where_and_eq_remark_value??)>
${prefixName?string('WHERE ', 'AND ')}"remark" = :where_and_eq_remark_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("remark" IS NULL OR "remark" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteCode??)>
<#if (where_and_eq_siteCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"site_code" = :where_and_eq_siteCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("site_code" IS NULL OR "site_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_siteId??)>
<#if (where_and_eq_siteId_value??)>
${prefixName?string('WHERE ', 'AND ')}"site_id" = :where_and_eq_siteId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("site_id" IS NULL OR "site_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_stateCode??)>
<#if (where_and_eq_stateCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"state_code" = :where_and_eq_stateCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("state_code" IS NULL OR "state_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoCode??)>
<#if (where_and_eq_systemInfoCode_value??)>
${prefixName?string('WHERE ', 'AND ')}"system_info_code" = :where_and_eq_systemInfoCode_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("system_info_code" IS NULL OR "system_info_code" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_systemInfoId??)>
<#if (where_and_eq_systemInfoId_value??)>
${prefixName?string('WHERE ', 'AND ')}"system_info_id" = :where_and_eq_systemInfoId_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("system_info_id" IS NULL OR "system_info_id" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_url??)>
<#if (where_and_eq_url_value??)>
${prefixName?string('WHERE ', 'AND ')}"url" = :where_and_eq_url_value
<#else>
${prefixName?string('WHERE ', 'AND ')}("url" IS NULL OR "url" = '')
</#if>
<#assign prefixName = false>
</#if>
<#if (where_and_eq_version??)>
<#if (where_and_eq_version_value??)>
${prefixName?string('WHERE ', 'AND ')}"version_" = :where_and_eq_version_value
<#else>
${prefixName?string('WHERE ', 'AND ')}"version_" IS NULL
</#if>
<#assign prefixName = false>
</#if>
