SELECT d.DICTIONARYITEM_CODE, d.NAME FROM c1_dictionary_item d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARYITEM_CODE`)
</#if>
ORDER BY d.ORDER_BY_, d.DICTIONARYITEM_CODE
LIMIT 20