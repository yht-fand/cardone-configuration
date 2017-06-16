SELECT t.NAVIGATION_CODE
, t.NAME
, t.PARENT_CODE
, (select count(*) from c1_NAVIGATION s where s.PARENT_CODE = t.NAVIGATION_CODE) as children_count
, t.URL
FROM c1_NAVIGATION t
WHERE t.state_code = '1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notId)>
    <#if cardone.StringUtils.isNotBlank(id)>
    AND :id = ANY(string_to_array(t.PARENT_TREE_CODE, ','))
    <#else>
    AND t.PARENT_CODE = ''
    </#if>
</#if>
<@cardone.permissionSql permissionColumnName="t.NAVIGATION_CODE" permissions=permissions />
ORDER BY t.ORDER_BY_, t.NAVIGATION_CODE