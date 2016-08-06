<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM `c1_dictionary_type` t
LEFT JOIN `c1_dictionary_type` p ON (p.`DICTIONARY_TYPE_CODE` = t.`PARENT_CODE`)
WHERE 1 = 1
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND (t.`DICTIONARY_TYPE_CODE` LIKE CONCAT('%',:dictionaryTypeCode,"%") OR t.`NAME` LIKE CONCAT('%',:dictionaryTypeCode,"%"))
</#if>
<#if StringUtils.isNotBlank(parentCode)>
AND (t.`PARENT_CODE` LIKE CONCAT('%',:parentCode,"%") OR p.`NAME` LIKE CONCAT('%',:parentCode,"%"))
</#if>