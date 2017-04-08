DELETE FROM c1_site WHERE
site_id = ANY(string_to_array(:siteIds, ','))