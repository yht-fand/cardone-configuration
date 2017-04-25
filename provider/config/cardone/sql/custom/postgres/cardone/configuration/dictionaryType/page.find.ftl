SELECT
t.dictionary_type_ID,
t.dictionary_type_CODE,
t.NAME,
t.PARENT_CODE,
t.PARENT_TREE_NAME,
t.PARENT_TREE_CODE,
t.CREATED_BY_CODE,
t.CREATED_DATE,
t.LAST_MODIFIED_BY_CODE,
t.LAST_MODIFIED_DATE,
t.BEGIN_DATE,
t.END_DATE,
t.FLAG_CODE,
t.STATE_CODE,
t.DATA_STATE_CODE
FROM
c1_dictionary_type t
<#if cardone.StringUtils.isNotBlank(dictionaryTypeId)>
WHERE t.dictionary_type_id = :dictionaryTypeId
<#else>
    <#include "page.where.ftl">
ORDER BY t.PARENT_CODE,
t.dictionary_type_CODE,
t.CREATED_DATE
limit <#if pageSize??>:pageSize<#else>10</#if> OFFSET <#if offset??>:offset<#else>0</#if>
</#if>