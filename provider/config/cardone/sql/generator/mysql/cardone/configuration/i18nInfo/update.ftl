UPDATE c1_i18n_info
<#assign prefixName = 'SET'>
<#if (update_beginDate??)>
<#if (update_beginDate_value??)>
${prefixName} `BEGIN_DATE` = :update_beginDate_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_content??)>
<#if (update_content_value??)>
${prefixName} `CONTENT` = :update_content_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_createdByCode??)>
<#if (update_createdByCode_value??)>
${prefixName} `CREATED_BY_CODE` = :update_createdByCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_createdDate??)>
<#if (update_createdDate_value??)>
${prefixName} `CREATED_DATE` = :update_createdDate_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_dataStateCode??)>
<#if (update_dataStateCode_value??)>
${prefixName} `DATA_STATE_CODE` = :update_dataStateCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_departmentCode??)>
<#if (update_departmentCode_value??)>
${prefixName} `DEPARTMENT_CODE` = :update_departmentCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_endDate??)>
<#if (update_endDate_value??)>
${prefixName} `END_DATE` = :update_endDate_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_i18nInfoCode??)>
<#if (update_i18nInfoCode_value??)>
${prefixName} `I18N_INFO_CODE` = :update_i18nInfoCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_i18nInfoId??)>
<#if (update_i18nInfoId_value??)>
${prefixName} `I18N_INFO_ID` = :update_i18nInfoId_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_lastModifiedByCode??)>
<#if (update_lastModifiedByCode_value??)>
${prefixName} `LAST_MODIFIED_BY_CODE` = :update_lastModifiedByCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_lastModifiedDate??)>
<#if (update_lastModifiedDate_value??)>
${prefixName} `LAST_MODIFIED_DATE` = :update_lastModifiedDate_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_orgCode??)>
<#if (update_orgCode_value??)>
${prefixName} `ORG_CODE` = :update_orgCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_permissionCodes??)>
<#if (update_permissionCodes_value??)>
${prefixName} `PERMISSION_CODES` = :update_permissionCodes_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_roleCodes??)>
<#if (update_roleCodes_value??)>
${prefixName} `ROLE_CODES` = :update_roleCodes_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_siteCode??)>
<#if (update_siteCode_value??)>
${prefixName} `SITE_CODE` = :update_siteCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_stateCode??)>
<#if (update_stateCode_value??)>
${prefixName} `STATE_CODE` = :update_stateCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_systemInfoCode??)>
<#if (update_systemInfoCode_value??)>
${prefixName} `SYSTEM_INFO_CODE` = :update_systemInfoCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_typeCode??)>
<#if (update_typeCode_value??)>
${prefixName} `TYPE_CODE` = :update_typeCode_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_version??)>
<#if (update_version_value??)>
${prefixName} `VERSION_` = :update_version_value
<#assign prefixName = ','>
</#if>
</#if>
<#if (update_wfId??)>
<#if (update_wfId_value??)>
${prefixName} `WF_ID` = :update_wfId_value
<#assign prefixName = ','>
</#if>
</#if>
<#include "where.ftl">