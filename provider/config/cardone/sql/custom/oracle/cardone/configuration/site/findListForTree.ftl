SELECT
t.site_id
, t.site_code
, t.name
, t.parent_id
, t.parent_code
, (select count(*) from c1_site s where s.PARENT_ID = t.site_id) as children_count
, t.url
FROM c1_site t
WHERE t.state_code = '1' and t.data_state_code = '1'
<@cardone.permissionSql prefixName=false permissions=permissions permissionColumnName="t.site_code"/>
ORDER BY t.order_by_, t.site_code