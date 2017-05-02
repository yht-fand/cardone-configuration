SELECT d.DICTIONARY_CODE, d.NAME FROM c1_dictionary d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.DICTIONARY_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_BY_, d.DICTIONARY_CODE
LIMIT 20