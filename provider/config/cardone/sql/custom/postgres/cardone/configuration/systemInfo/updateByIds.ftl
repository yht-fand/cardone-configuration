UPDATE c1_system_info SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
system_info_id = ANY(string_to_array(:systemInfoIds, ','))