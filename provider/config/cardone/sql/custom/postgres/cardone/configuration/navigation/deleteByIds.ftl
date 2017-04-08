DELETE FROM c1_navigation WHERE
navigation_id = ANY(string_to_array(:navigationIds, ','))