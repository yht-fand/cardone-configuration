SELECT d.SITE_CODE, d.NAME FROM c1_site d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.SITE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.SITE_CODE
LIMIT 20