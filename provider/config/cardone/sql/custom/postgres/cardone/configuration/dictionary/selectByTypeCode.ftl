SELECT
c1_d.*
FROM c1_dictionary c1_d
<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
${prefixName?string('WHERE ', 'AND ')}c1_d.DICTIONARY_TYPE_CODE = :dictionaryTypeCode
<#assign prefixName = false>
</#if>
ORDER BY order_by_