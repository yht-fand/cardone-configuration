SELECT d.NAVIGATION_CODE, d.NAME FROM c1_navigation d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.NAVIGATION_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.NAVIGATION_CODE
LIMIT 20