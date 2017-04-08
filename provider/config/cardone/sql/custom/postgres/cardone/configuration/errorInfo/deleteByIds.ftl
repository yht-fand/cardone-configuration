DELETE FROM c1_error_info WHERE
error_info_id = ANY(string_to_array(:errorInfoIds, ','))