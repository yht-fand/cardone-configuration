<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT t.SYSTEM_INFO_ID,
t.SYSTEM_INFO_CODE,
t.`NAME`,
t.`CONTENT`,
t.CREATED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.CREATED_BY_CODE) AS CREATED_BY_NAME,
DATE_FORMAT(T.CREATED_DATE,'%Y-%m-%d') AS CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
(SELECT MAX(s.name) FROM `c1_user` s WHERE s.user_code = t.LAST_MODIFIED_BY_CODE) AS LAST_MODIFIED_BY_NAME,
DATE_FORMAT(T.LAST_MODIFIED_DATE,'%Y-%m-%d') AS LAST_MODIFIED_DATE
FROM `c1_system_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(systemInfoCode)>
AND (t.`SYSTEM_INFO_CODE` LIKE CONCAT('%',:systemInfoCode,"%") OR t.`NAME` LIKE CONCAT('%',:systemInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(content)>
AND t.`CONTENT` LIKE CONCAT('%',:content,"%")
</#if>
<#if StringUtils.isNotBlank(systemInfoId)>
AND t.`SYSTEM_INFO_ID` = :systemInfoId
<#else>
ORDER BY  t.`SYSTEM_INFO_CODE`
LIMIT :offset, :pageSize
</#if>
