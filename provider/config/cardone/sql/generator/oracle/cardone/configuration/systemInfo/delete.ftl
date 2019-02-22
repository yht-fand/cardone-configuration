DELETE FROM C1_SYSTEM_INFO
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>