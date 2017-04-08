UPDATE c1_site SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
site_id = ANY(string_to_array(:siteIds, ','))