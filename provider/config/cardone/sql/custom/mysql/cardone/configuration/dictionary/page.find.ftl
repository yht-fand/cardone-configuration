<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT
c1_d.DICTIONARY_ID,
c1_d.DICTIONARY_CODE,
c1_d.SYSTEM_INFO_CODE,
c1_d.NAME,
(SELECT MAX(s.name) FROM `c1_system_info` s WHERE s.SYSTEM_INFO_CODE = c1_d.SYSTEM_INFO_CODE) AS SYSTEM_INFO_NAME,
c1_d.SITE_CODE,
(SELECT MAX(s.name) FROM `c1_site` s WHERE s.SITE_CODE = c1_d.SITE_CODE) AS SITE_NAME,
c1_d.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = c1_d.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(c1_d.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
c1_d.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = c1_d.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(c1_d.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE,
c1_d_t.NAME AS DICTIONARY_TYPE_NAME ,c1_d_t.DICTIONARY_TYPE_CODE FROM c1_dictionary c1_d LEFT JOIN c1_dictionary_type c1_d_t ON  c1_d.DICTIONARY_TYPE_CODE = c1_d_t.DICTIONARY_TYPE_CODE
WHERE 1=1
<#if StringUtils.isNotBlank(dictionaryCode)>
AND (c1_d.`DICTIONARY_CODE` LIKE CONCAT('%',:dictionaryCode,"%") OR c1_d.`NAME` LIKE CONCAT('%',:dictionaryCode,"%"))
</#if>
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND (c1_d_t.`DICTIONARY_TYPE_CODE` LIKE CONCAT('%',:dictionaryTypeCode,"%") OR c1_d_t.`NAME` LIKE CONCAT('%',:dictionaryTypeCode,"%"))
</#if>
<#if StringUtils.isNotBlank(dictionaryId)>
AND c1_d.`DICTIONARY_ID` = :dictionaryId
<#else>
ORDER BY  c1_d.SYSTEM_INFO_CODE,c1_d.SITE_CODE,c1_d.DICTIONARY_TYPE_CODE, c1_d.ORDER_
LIMIT :offset, :pageSize
</#if>