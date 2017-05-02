SELECT d.ERRORINFO_CODE, d.NAME FROM c1_error_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ERRORINFO_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.ERRORINFO_CODE
LIMIT 20