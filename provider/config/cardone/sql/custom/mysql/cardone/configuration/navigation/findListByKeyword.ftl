<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.NAVIGATION_CODE  ,d.NAME FROM c1_navigation d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`NAVIGATION_CODE`)
</#if>
ORDER BY d.ORDER_, d.NAVIGATION_CODE
LIMIT 20