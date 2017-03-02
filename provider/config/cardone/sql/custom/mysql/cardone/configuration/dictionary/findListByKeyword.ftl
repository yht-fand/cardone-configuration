<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.DICTIONARY_CODE  ,d.NAME FROM c1_dictionary d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`DICTIONARY_CODE`)
</#if>
ORDER BY d.ORDER_, d.DICTIONARY_CODE
LIMIT 20