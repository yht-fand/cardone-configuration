<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM `c1_site` t left join `c1_system_info` si on (si.SYSTEM_INFO_CODE = t.SYSTEM_INFO_CODE)
WHERE 1 = 1
<#if StringUtils.isNotBlank(siteCode)>
AND (t.`SITE_CODE` LIKE CONCAT('%',:siteCode,"%") OR t.`NAME` LIKE CONCAT('%',:siteCode,"%"))
</#if>
<#if StringUtils.isNotBlank(systemInfoCode)>
AND (t.`SYSTEM_INFO_CODE` LIKE CONCAT('%',:systemInfoCode,"%") OR si.`NAME` LIKE CONCAT('%',:systemInfoCode,"%"))
</#if>