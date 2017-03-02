<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.ERRORINFO_CODE  ,d.NAME FROM c1_error_info d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`ERRORINFO_CODE`)
</#if>
ORDER BY d.ORDER_, d.ERRORINFO_CODE
LIMIT 20