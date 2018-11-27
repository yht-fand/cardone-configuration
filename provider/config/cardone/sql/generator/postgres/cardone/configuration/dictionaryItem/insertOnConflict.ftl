<#include "insert.ftl">
on conflict (
<#assign prefixName = true>
<#if (index_batchNo??)>
${prefixName?string('', ', ')}"batch_no"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_beginDate??)>
${prefixName?string('', ', ')}"begin_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdByCode??)>
${prefixName?string('', ', ')}"created_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdById??)>
${prefixName?string('', ', ')}"created_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_createdDate??)>
${prefixName?string('', ', ')}"created_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dataStateCode??)>
${prefixName?string('', ', ')}"data_state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_departmentCode??)>
${prefixName?string('', ', ')}"department_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryCode??)>
${prefixName?string('', ', ')}"dictionary_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryId??)>
${prefixName?string('', ', ')}"dictionary_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryItemCode??)>
${prefixName?string('', ', ')}"dictionary_item_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryItemId??)>
${prefixName?string('', ', ')}"dictionary_item_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryTypeCode??)>
${prefixName?string('', ', ')}"dictionary_type_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_dictionaryTypeId??)>
${prefixName?string('', ', ')}"dictionary_type_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_endDate??)>
${prefixName?string('', ', ')}"end_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_explain??)>
${prefixName?string('', ', ')}"explain_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagCode??)>
${prefixName?string('', ', ')}"flag_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_flagObjectCode??)>
${prefixName?string('', ', ')}"flag_object_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_jsonData??)>
${prefixName?string('', ', ')}"json_data"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedByCode??)>
${prefixName?string('', ', ')}"last_modified_by_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedById??)>
${prefixName?string('', ', ')}"last_modified_by_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_lastModifiedDate??)>
${prefixName?string('', ', ')}"last_modified_date"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_name??)>
${prefixName?string('', ', ')}"name"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orderBy??)>
${prefixName?string('', ', ')}"order_by_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_orgCode??)>
${prefixName?string('', ', ')}"org_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalCode??)>
${prefixName?string('', ', ')}"personal_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_personalId??)>
${prefixName?string('', ', ')}"personal_id"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_remark??)>
${prefixName?string('', ', ')}"remark"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_siteCode??)>
${prefixName?string('', ', ')}"site_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_stateCode??)>
${prefixName?string('', ', ')}"state_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_systemInfoCode??)>
${prefixName?string('', ', ')}"system_info_code"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_value??)>
${prefixName?string('', ', ')}"value_"
</#if>
<#assign prefixName = false>
</#if>
<#if (index_version??)>
${prefixName?string('', ', ')}"version_"
</#if>
<#assign prefixName = false>
</#if>
) do nothing