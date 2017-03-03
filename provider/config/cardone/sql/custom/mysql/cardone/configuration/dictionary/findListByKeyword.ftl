SELECT d.DICTIONARY_CODE  ,d.NAME FROM c1_dictionary d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARY_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARY_CODE
LIMIT 20