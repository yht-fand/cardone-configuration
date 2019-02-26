SELECT
t.NAVIGATION_ID
, t.NAVIGATION_CODE
, t.NAME
, t.PARENT_ID
, t.PARENT_CODE
, t.URL
, t.ICON_STYLE
FROM c1_NAVIGATION t
WHERE t.state_code = '1' and t.data_state_code = '1'
ORDER BY t.ORDER_BY_, t.NAVIGATION_CODE