SELECT
<#assign prefixName = ' '>
<#if (select_beginDate??)>
${prefixName} `BEGIN_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_createdByCode??)>
${prefixName} `CREATED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_createdDate??)>
${prefixName} `CREATED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_dataOption??)>
${prefixName} `DATA_OPTION`
<#assign prefixName = ','>
</#if>
<#if (select_dataStateCode??)>
${prefixName} `DATA_STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_departmentCode??)>
${prefixName} `DEPARTMENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_endDate??)>
${prefixName} `END_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_flagCode??)>
${prefixName} `FLAG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_flagObjectCode??)>
${prefixName} `FLAG_OBJECT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_iconStyle??)>
${prefixName} `ICON_STYLE`
<#assign prefixName = ','>
</#if>
<#if (select_jsonData??)>
${prefixName} `JSON_DATA`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE`
<#assign prefixName = ','>
</#if>
<#if (select_name??)>
${prefixName} `NAME`
<#assign prefixName = ','>
</#if>
<#if (select_navigationCode??)>
${prefixName} `NAVIGATION_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_navigationId??)>
${prefixName} `NAVIGATION_ID`
<#assign prefixName = ','>
</#if>
<#if (select_order??)>
${prefixName} `ORDER_`
<#assign prefixName = ','>
</#if>
<#if (select_orgCode??)>
${prefixName} `ORG_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentCode??)>
${prefixName} `PARENT_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeCode??)>
${prefixName} `PARENT_TREE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_parentTreeName??)>
${prefixName} `PARENT_TREE_NAME`
<#assign prefixName = ','>
</#if>
<#if (select_siteCode??)>
${prefixName} `SITE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_stateCode??)>
${prefixName} `STATE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_target??)>
${prefixName} `TARGET`
<#assign prefixName = ','>
</#if>
<#if (select_typeCode??)>
${prefixName} `TYPE_CODE`
<#assign prefixName = ','>
</#if>
<#if (select_url??)>
${prefixName} `URL`
<#assign prefixName = ','>
</#if>
<#if (select_version??)>
${prefixName} `VERSION_`
<#assign prefixName = ','>
</#if>
<#if prefixName ==  ' '>
*
</#if>
FROM c1_navigation
<#include "where.ftl">
<#assign prefixName = 'ORDER BY'>
<#if (order_by_beginDate??)>
${prefixName} `BEGIN_DATE` ${order_by_beginDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdByCode??)>
${prefixName} `CREATED_BY_CODE` ${order_by_createdByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_createdDate??)>
${prefixName} `CREATED_DATE` ${order_by_createdDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataOption??)>
${prefixName} `DATA_OPTION` ${order_by_dataOption_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_dataStateCode??)>
${prefixName} `DATA_STATE_CODE` ${order_by_dataStateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_departmentCode??)>
${prefixName} `DEPARTMENT_CODE` ${order_by_departmentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_endDate??)>
${prefixName} `END_DATE` ${order_by_endDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagCode??)>
${prefixName} `FLAG_CODE` ${order_by_flagCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_flagObjectCode??)>
${prefixName} `FLAG_OBJECT_CODE` ${order_by_flagObjectCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_iconStyle??)>
${prefixName} `ICON_STYLE` ${order_by_iconStyle_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_jsonData??)>
${prefixName} `JSON_DATA` ${order_by_jsonData_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedByCode??)>
${prefixName} `LAST_MODIFIED_BY_CODE` ${order_by_lastModifiedByCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_lastModifiedDate??)>
${prefixName} `LAST_MODIFIED_DATE` ${order_by_lastModifiedDate_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_name??)>
${prefixName} `NAME` ${order_by_name_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationCode??)>
${prefixName} `NAVIGATION_CODE` ${order_by_navigationCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_navigationId??)>
${prefixName} `NAVIGATION_ID` ${order_by_navigationId_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_order??)>
${prefixName} `ORDER_` ${order_by_order_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_orgCode??)>
${prefixName} `ORG_CODE` ${order_by_orgCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentCode??)>
${prefixName} `PARENT_CODE` ${order_by_parentCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeCode??)>
${prefixName} `PARENT_TREE_CODE` ${order_by_parentTreeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_parentTreeName??)>
${prefixName} `PARENT_TREE_NAME` ${order_by_parentTreeName_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_siteCode??)>
${prefixName} `SITE_CODE` ${order_by_siteCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_stateCode??)>
${prefixName} `STATE_CODE` ${order_by_stateCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_systemInfoCode??)>
${prefixName} `SYSTEM_INFO_CODE` ${order_by_systemInfoCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_target??)>
${prefixName} `TARGET` ${order_by_target_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_typeCode??)>
${prefixName} `TYPE_CODE` ${order_by_typeCode_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_url??)>
${prefixName} `URL` ${order_by_url_value!}
<#assign prefixName = ','>
</#if>
<#if (order_by_version??)>
${prefixName} `VERSION_` ${order_by_version_value!}
<#assign prefixName = ','>
</#if>
