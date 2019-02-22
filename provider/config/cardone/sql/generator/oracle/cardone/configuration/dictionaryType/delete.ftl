DELETE FROM C1_DICTIONARY_TYPE
<#include "where.ftl">
<#if (prefixName && !(delete_all??))>
WHERE 1 = 2
</#if>