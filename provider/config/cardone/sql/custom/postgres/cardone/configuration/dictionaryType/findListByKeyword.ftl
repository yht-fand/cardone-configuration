SELECT d.DICTIONARYTYPE_CODE, d.NAME FROM c1_dictionary_type d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.DICTIONARYTYPE_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.DICTIONARYTYPE_CODE
LIMIT 20