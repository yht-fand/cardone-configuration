SELECT t.dictionary_type_CODE, t.NAME , t.PARENT_CODE FROM c1_dictionary_type t
<#if cardone.StringUtils.isNotBlank(id)>
WHERE :id = ANY(string_to_array(t.PARENT_TREE_CODE, ','))
</#if>
ORDER BY t.ORDER_, t.dictionary_type_CODE