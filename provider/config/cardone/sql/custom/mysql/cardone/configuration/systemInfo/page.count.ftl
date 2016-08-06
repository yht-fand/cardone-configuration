<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM `c1_system_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(systemInfoCode)>
AND (t.`SYSTEM_INFO_CODE` LIKE CONCAT('%',:systemInfoCode,"%") OR t.`NAME` LIKE CONCAT('%',:systemInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(content)>
AND t.`CONTENT` LIKE CONCAT('%',:content,"%")
</#if>