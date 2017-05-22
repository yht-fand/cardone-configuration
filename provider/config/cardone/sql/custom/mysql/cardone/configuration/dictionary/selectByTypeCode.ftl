SELECT
c1_d.DICTIONARY_CODE,
c1_d.NAME
FROM c1_dictionary c1_d
where 1=1
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
AND c1_d.`DICTIONARY_TYPE_CODE` = :dictionaryTypeCode
</#if>
ORDER BY order_by_