<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.DICTIONARYTYPE_CODE  ,d.NAME FROM c1_dictionary_type d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARYTYPE_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARYTYPE_CODE
LIMIT 20