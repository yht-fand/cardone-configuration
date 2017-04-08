DELETE FROM c1_i18n_info WHERE
i18n_info_id = ANY(string_to_array(:i18nInfoIds, ','))