SELECT d.SYSTEMINFO_CODE  ,d.NAME FROM c1_system_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.SYSTEMINFO_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.SYSTEMINFO_CODE
LIMIT 20