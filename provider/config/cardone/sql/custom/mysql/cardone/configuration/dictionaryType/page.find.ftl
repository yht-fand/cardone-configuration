<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT t.DICTIONARY_TYPE_ID,
t.SYSTEM_INFO_CODE,
(SELECT MAX(s.name) FROM `c1_system_info` s WHERE s.SYSTEM_INFO_CODE = t.SYSTEM_INFO_CODE) AS SYSTEM_INFO_NAME,
t.SITE_CODE,
(SELECT MAX(s.name) FROM `c1_site` s WHERE s.SITE_CODE = t.SITE_CODE) AS SITE_NAME,
p.`PARENT_CODE`,
p.`NAME` AS 'PARENT_NAME',
t.`DICTIONARY_TYPE_CODE`,
t.`NAME`,
t.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(T.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(T.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE
FROM `c1_dictionary_type` t
LEFT JOIN `c1_dictionary_type` p ON (p.`DICTIONARY_TYPE_CODE` = t.`PARENT_CODE`)
WHERE 1 = 1
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND (t.`DICTIONARY_TYPE_CODE` LIKE CONCAT('%',:dictionaryTypeCode,"%") OR t.`NAME` LIKE CONCAT('%',:dictionaryTypeCode,"%"))
</#if>
<#if StringUtils.isNotBlank(parentCode)>
AND (t.`PARENT_CODE` LIKE CONCAT('%',:parentCode,"%") OR p.`NAME` LIKE CONCAT('%',:parentCode,"%"))
</#if>
<#if StringUtils.isNotBlank(dictionaryTypeId)>
AND t.`DICTIONARY_TYPE_ID` = :dictionaryTypeId
<#else>
ORDER BY t.SYSTEM_INFO_CODE, t.SITE_CODE, t.PARENT_CODE, t.ORDER_
LIMIT :offset, :pageSize
</#if>