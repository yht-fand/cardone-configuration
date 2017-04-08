DELETE FROM c1_system_info WHERE
system_info_id = ANY(string_to_array(:systemInfoIds, ','))