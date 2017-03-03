SELECT d.SYSTEMINFO_CODE  ,d.NAME FROM c1_system_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`SYSTEMINFO_CODE`)
</#if>
ORDER BY d.ORDER_, d.SYSTEMINFO_CODE
LIMIT 20