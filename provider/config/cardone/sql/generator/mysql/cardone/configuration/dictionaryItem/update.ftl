UPDATE c1_dictionary_item
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
<#if (update_createdByCode??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_createdDate??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
<#if (update_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
<#if (update_dictionaryCode??)>
${prefixName} `DICTIONARY_CODE` = :update_dictionaryCode_value
<#assign prefixName = ','>
</#if>
<#if (update_dictionaryItemCode??)>
${prefixName} `DICTIONARY_ITEM_CODE` = :update_dictionaryItemCode_value
<#assign prefixName = ','>
</#if>
<#if (update_dictionaryItemId??)>
${prefixName} `DICTIONARY_ITEM_ID` = :update_dictionaryItemId_value
<#assign prefixName = ','>
</#if>
<#if (update_dictionaryTypeCode??)>
${prefixName} `DICTIONARY_TYPE_CODE` = :update_dictionaryTypeCode_value
<#assign prefixName = ','>
</#if>
<#if (update_endDate??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
<#if (update_explain??)>
${prefixName} `EXPLAIN_` = :update_explain_value
<#assign prefixName = ','>
</#if>
<#if (update_flagCode??)>
${prefixName} `FLAG_CODE` = :update_flagCode_value
<#assign prefixName = ','>
</#if>
<#if (update_flagObjectCode??)>
${prefixName} `FLAG_OBJECT_CODE` = :update_flagObjectCode_value
<#assign prefixName = ','>
</#if>
<#if (update_jsonData??)>
${prefixName} `JSON_DATA` = :update_jsonData_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
<#if (update_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
<#if (update_name??)>
${prefixName} `NAME` = :update_name_value
<#assign prefixName = ','>
</#if>
<#if (update_order??)>
${prefixName} `ORDER_` = :update_order_value
<#assign prefixName = ','>
</#if>
<#if (update_orgCode??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
<#if (update_remark??)>
${prefixName} `REMARK` = :update_remark_value
<#assign prefixName = ','>
</#if>
<#if (update_siteCode??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
<#assign prefixName = ','>
</#if>
<#if (update_stateCode??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
<#if (update_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
<#assign prefixName = ','>
</#if>
<#if (update_value??)>
${prefixName} `VALUE_` = :update_value_value
<#assign prefixName = ','>
</#if>
<#if (update_version??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
<#include "where.ftl">