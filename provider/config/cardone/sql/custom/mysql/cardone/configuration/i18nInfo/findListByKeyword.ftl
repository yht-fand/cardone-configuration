<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT d.I18NINFO_CODE  ,d.NAME FROM c1_i18n_info d
<#if StringUtils.isNotBlank(term)>
WHERE LOCATE(:term, d.`NAME`) OR LOCATE(:term, d.`I18NINFO_CODE`)
</#if>
ORDER BY d.ORDER_, d.I18NINFO_CODE
LIMIT 20