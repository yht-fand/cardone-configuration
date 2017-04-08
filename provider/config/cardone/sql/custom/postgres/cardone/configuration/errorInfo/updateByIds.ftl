UPDATE c1_error_info SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
error_info_id = ANY(string_to_array(:errorInfoIds, ','))