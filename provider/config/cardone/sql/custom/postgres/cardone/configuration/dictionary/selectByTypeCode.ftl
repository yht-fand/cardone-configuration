SELECT
c1_d.*
FROM c1_dictionary c1_d
where c1_d.data_state_code = '1' and c1_d.state_code = '1'
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
and c1_d.DICTIONARY_TYPE_CODE = :dictionaryTypeCode
</#if>
ORDER BY order_by_