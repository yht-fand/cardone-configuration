SELECT
t.NAVIGATION_ID
, t.NAVIGATION_CODE
, t.NAME
, t.PARENT_ID
, t.PARENT_CODE
, (select count(*) from c1_NAVIGATION s where s.PARENT_ID = t.NAVIGATION_ID) as children_count
, t.URL
FROM c1_NAVIGATION t
WHERE t.state_code = '1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notId)>
    <#if cardone.StringUtils.isNotBlank(id)>
    AND t.PARENT_ID = :id
    <#else>
    AND t.PARENT_ID = ''
    </#if>
</#if>
<@cardone.permissionSql prefixName=false permissions=permissions permissionColumnName="t.NAVIGATION_CODE"/>
ORDER BY t.ORDER_BY_, t.NAVIGATION_CODE