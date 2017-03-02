<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.SYSTEMINFO_CODE  ,d.NAME FROM c1_system_info d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`SYSTEMINFO_CODE`)
</#if>
ORDER BY d.ORDER_, d.SYSTEMINFO_CODE
LIMIT 20