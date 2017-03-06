SELECT t.NAVIGATION_CODE ,t.NAME, t.PARENT_CODE, t.URL FROM c1_NAVIGATION t
WHERE 1 = 1
<#if cardone.StringUtils.isNotBlank(id)>
AND  FIND_IN_SET(:id, t.`PARENT_TREE_CODE`)
</#if>
<@cardone.permissionSql permissionColumnName="t.NAVIGATION_CODE" permissions=permissions />
ORDER BY t.ORDER_, t.NAVIGATION_CODE