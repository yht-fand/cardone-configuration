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
<#if (select_dictionaryCode??)>
${prefixName?string('  ', ', ')}"dictionary_code"
<#assign prefixName = false>
</#if>
<#if (select_dictionaryId??)>
${prefixName?string('  ', ', ')}"dictionary_id"
<#assign prefixName = false>
</#if>
<#if (select_dictionaryItemCode??)>
${prefixName?string('  ', ', ')}"dictionary_item_code"
<#assign prefixName = false>
</#if>
<#if (select_dictionaryItemId??)>
${prefixName?string('  ', ', ')}"dictionary_item_id"
<#assign prefixName = false>
</#if>
<#if (select_dictionaryTypeCode??)>
${prefixName?string('  ', ', ')}"dictionary_type_code"
<#assign prefixName = false>
</#if>
<#if (select_dictionaryTypeId??)>
${prefixName?string('  ', ', ')}"dictionary_type_id"
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
<#if (select_personalCode??)>
${prefixName?string('  ', ', ')}"personal_code"
<#assign prefixName = false>
</#if>
<#if (select_personalId??)>
${prefixName?string('  ', ', ')}"personal_id"
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
<#if (select_stateCode??)>
${prefixName?string('  ', ', ')}"state_code"
<#assign prefixName = false>
</#if>
<#if (select_systemInfoCode??)>
${prefixName?string('  ', ', ')}"system_info_code"
<#assign prefixName = false>
</#if>
<#if (select_value??)>
${prefixName?string('  ', ', ')}"value_"
<#assign prefixName = false>
</#if>
<#if (select_version??)>
${prefixName?string('  ', ', ')}"version_"
<#assign prefixName = false>
</#if>
<#if prefixName>
*
</#if>
FROM "c1_dictionary_item"
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
<#if (order_by_dictionaryCode??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_code" ${order_by_dictionaryCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dictionaryId??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_id" ${order_by_dictionaryId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dictionaryItemCode??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_item_code" ${order_by_dictionaryItemCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dictionaryItemId??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_item_id" ${order_by_dictionaryItemId_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dictionaryTypeCode??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_type_code" ${order_by_dictionaryTypeCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_dictionaryTypeId??)>
${prefixName?string('ORDER BY ', ', ')}"dictionary_type_id" ${order_by_dictionaryTypeId_value!}
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
<#if (order_by_personalCode??)>
${prefixName?string('ORDER BY ', ', ')}"personal_code" ${order_by_personalCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_personalId??)>
${prefixName?string('ORDER BY ', ', ')}"personal_id" ${order_by_personalId_value!}
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
<#if (order_by_stateCode??)>
${prefixName?string('ORDER BY ', ', ')}"state_code" ${order_by_stateCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName?string('ORDER BY ', ', ')}"system_info_code" ${order_by_systemInfoCode_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_value??)>
${prefixName?string('ORDER BY ', ', ')}"value_" ${order_by_value_value!}
<#assign prefixName = false>
</#if>
<#if (order_by_version??)>
${prefixName?string('ORDER BY ', ', ')}"version_" ${order_by_version_value!}
<#assign prefixName = false>
</#if>
