SELECT
c1_di.*
FROM c1_dictionary_item c1_di
where c1_di.data_state_code = '1' and c1_di.state_code = '1'
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
and c1_di.DICTIONARY_TYPE_CODE = :dictionaryTypeCode
</#if>
<#if cardone.StringUtils.isNotBlank(dictionaryCode)>
and c1_di.dictionary_code = :dictionaryCode
</#if>
ORDER BY order_by_