<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT t.ERROR_INFO_ID,
t.ERROR_INFO_CODE,
(SELECT MAX(s.name) FROM `c1_system_info` s WHERE s.SYSTEM_INFO_CODE = t.SYSTEM_INFO_CODE) AS SYSTEM_INFO_NAME,
t.SITE_CODE,
(SELECT MAX(s.name) FROM `c1_site` s WHERE s.SITE_CODE = t.SITE_CODE) AS SITE_NAME,
t.CONTENT,
t.TYPE_CODE,
(SELECT MAX(s.name) FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'errorInfo' AND s.DICTIONARY_CODE= t.TYPE_CODE) AS TYPE_NAME,
t.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(T.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(T.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE
FROM `c1_error_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(errorInfoCode)>
AND (t.`ERROR_INFO_CODE` LIKE CONCAT('%',:errorInfoCode,"%") OR t.`CONTENT` LIKE CONCAT('%',:errorInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(typeCode)>
AND t.`TYPE_CODE` = :typeCode
</#if>
<#if StringUtils.isNotBlank(errorInfoId)>
AND t.`ERROR_INFO_ID` = :errorInfoId
<#else>
ORDER BY t.TYPE_CODE, t.ERROR_INFO_CODE
LIMIT :offset, :pageSize
</#if>