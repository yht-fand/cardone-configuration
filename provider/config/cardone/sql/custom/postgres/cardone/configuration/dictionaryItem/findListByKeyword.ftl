SELECT d.DICTIONARYITEM_CODE, d.NAME FROM c1_dictionary_item d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.DICTIONARYITEM_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.DICTIONARYITEM_CODE
LIMIT 20