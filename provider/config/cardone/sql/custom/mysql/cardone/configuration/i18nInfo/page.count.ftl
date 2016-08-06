<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
SELECT count(1)
FROM `c1_i18n_info` t
WHERE 1 = 1
<#if StringUtils.isNotBlank(i18nInfoCode)>
AND (t.`I18N_INFO_CODE` LIKE CONCAT('%',:i18nInfoCode,"%") OR t.`CONTENT` LIKE CONCAT('%',:i18nInfoCode,"%"))
</#if>
<#if StringUtils.isNotBlank(typeCode)>
AND t.TYPE_CODE = :typeCode
</#if>