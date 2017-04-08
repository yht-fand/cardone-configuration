UPDATE c1_navigation SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
navigation_id = ANY(string_to_array(:navigationIds, ','))