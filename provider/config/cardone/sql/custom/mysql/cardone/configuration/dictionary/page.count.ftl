<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM c1_dictionary c1_d LEFT JOIN c1_dictionary_type c1_d_t ON  c1_d.DICTIONARY_TYPE_CODE = c1_d_t.DICTIONARY_TYPE_CODE
WHERE 1=1
<#if StringUtils.isNotBlank(dictionaryCode)>
AND (c1_d.`DICTIONARY_CODE` LIKE CONCAT('%',:dictionaryCode,"%") OR c1_d.`NAME` LIKE CONCAT('%',:dictionaryCode,"%"))
</#if>
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND (c1_d_t.`DICTIONARY_TYPE_CODE` LIKE CONCAT('%',:dictionaryTypeCode,"%") OR c1_d_t.`NAME` LIKE CONCAT('%',:dictionaryTypeCode,"%"))
</#if>