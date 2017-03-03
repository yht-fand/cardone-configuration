SELECT d.DICTIONARYTYPE_CODE  ,d.NAME FROM c1_dictionary_type d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARYTYPE_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARYTYPE_CODE
LIMIT 20