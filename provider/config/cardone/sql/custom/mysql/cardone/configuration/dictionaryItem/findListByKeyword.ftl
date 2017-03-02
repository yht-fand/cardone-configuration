<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.DICTIONARYITEM_CODE  ,d.NAME FROM c1_dictionary_item d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARYITEM_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARYITEM_CODE
LIMIT 20