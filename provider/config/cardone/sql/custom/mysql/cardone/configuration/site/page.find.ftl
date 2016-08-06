<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT t.SITE_ID,
t.SYSTEM_INFO_CODE,
si.name AS SYSTEM_INFO_NAME,
t.SITE_CODE,
t.`NAME`,
t.`CONTENT`,
t.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(T.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(T.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE
FROM `c1_site` t left join `c1_system_info` si on (si.SYSTEM_INFO_CODE = t.SYSTEM_INFO_CODE)
WHERE 1 = 1
<#if StringUtils.isNotBlank(siteCode)>
AND (t.`SITE_CODE` LIKE CONCAT('%',:siteCode,"%") OR t.`NAME` LIKE CONCAT('%',:siteCode,"%"))
</#if>
<#if StringUtils.isNotBlank(systemInfoCode)>
AND (t.`SYSTEM_INFO_CODE` LIKE CONCAT('%',:systemInfoCode,"%") OR si.`NAME` LIKE CONCAT('%',:systemInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(siteId)>
AND t.`SITE_ID` = :siteId
<#else>
ORDER BY  t.`SYSTEM_INFO_CODE`, t.`SITE_ID`
LIMIT :offset, :pageSize
</#if>
