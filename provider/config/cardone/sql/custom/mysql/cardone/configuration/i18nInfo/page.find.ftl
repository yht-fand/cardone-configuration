<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT t.I18N_INFO_ID,
t.I18N_INFO_CODE,
t.SYSTEM_INFO_CODE,
(SELECT MAX(s.name) FROM `c1_system_info` s WHERE s.SYSTEM_INFO_CODE = t.SYSTEM_INFO_CODE) AS SYSTEM_INFO_NAME,
t.SITE_CODE,
(SELECT MAX(s.name) FROM `c1_site` s WHERE s.SITE_CODE = t.SITE_CODE) AS SITE_NAME,
t.CONTENT,
t.TYPE_CODE,
(SELECT MAX(s.name) FROM `c1_dictionary` s WHERE s.DICTIONARY_TYPE_CODE = 'lang' AND s.DICTIONARY_CODE= t.TYPE_CODE) AS TYPE_NAME,
t.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(T.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(T.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE
FROM `c1_i18n_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(i18nInfoCode)>
AND (t.`I18N_INFO_CODE` LIKE CONCAT('%',:i18nInfoCode,"%") OR t.`CONTENT` LIKE CONCAT('%',:i18nInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(typeCode)>
AND t.TYPE_CODE = :typeCode
</#if>
<#if StringUtils.isNotBlank(i18nInfoId)>
AND t.`I18N_INFO_ID` = :i18nInfoId
<#else>
ORDER BY  t.`TYPE_CODE`, t.`I18N_INFO_CODE`
LIMIT :offset, :pageSize
</#if>