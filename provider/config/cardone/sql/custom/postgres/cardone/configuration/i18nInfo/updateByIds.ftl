UPDATE c1_i18n_info SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
i18n_info_id = ANY(string_to_array(:i18nInfoIds, ','))