SELECT
t.site_id
, t.site_code
, t."name"
, t.parent_id
, t.parent_code
, 0 as children_count
FROM c1_site t
WHERE t.state_code = '1' and t.data_state_code = '1'

ORDER BY t.order_by_, t.site_code