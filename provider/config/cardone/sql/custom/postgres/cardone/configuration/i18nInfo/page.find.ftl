SELECT T.*
FROM c1_i18n_info t
<#if cardone.StringUtils.isNotBlank(i18nInfoId)>
WHERE t.i18n_info_id = :i18nInfoId
<#else>
    <#include "page.where.ftl">
ORDER BY t.TYPE_CODE,
t.i18n_info_code,
t.CREATED_DATE
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>