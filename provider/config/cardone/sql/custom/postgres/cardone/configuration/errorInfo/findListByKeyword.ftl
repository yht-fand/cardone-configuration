SELECT d.ERRORINFO_CODE, d.NAME FROM c1_error_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.ERRORINFO_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.ERRORINFO_CODE
LIMIT 20