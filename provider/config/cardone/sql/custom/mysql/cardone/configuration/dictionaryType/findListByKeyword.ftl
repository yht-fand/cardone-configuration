SELECT d.DICTIONARY_TYPE_CODE, d.NAME FROM c1_dictionary_type d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARY_TYPE_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARY_TYPE_CODE
LIMIT 20