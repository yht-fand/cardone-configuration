<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT
c1_d.DICTIONARY_CODE,
c1_d.NAME
FROM c1_dictionary c1_d
where 1=1
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND c1_d.`DICTIONARY_TYPE_CODE` = :dictionaryTypeCode
</#if>
ORDER BY ORDER_