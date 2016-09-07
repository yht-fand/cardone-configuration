<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM `c1_error_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(errorInfoCode)>
AND (t.`ERROR_INFO_CODE` LIKE CONCAT('%',:errorInfoCode,"%") OR t.`CONTENT` LIKE CONCAT('%',:errorInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(typeCode)>
AND t.`TYPE_CODE` = :typeCode
</#if>