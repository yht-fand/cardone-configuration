SELECT d.SITE_CODE  ,d.NAME FROM c1_site d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`SITE_CODE`)
</#if>
ORDER BY d.ORDER_, d.SITE_CODE
LIMIT 20