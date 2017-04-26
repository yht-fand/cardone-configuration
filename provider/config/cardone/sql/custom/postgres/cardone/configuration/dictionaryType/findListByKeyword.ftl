SELECT d.DICTIONARY_TYPE_CODE, d.NAME FROM c1_dictionary_type d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.DICTIONARY_TYPE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.DICTIONARY_TYPE_CODE
LIMIT 20