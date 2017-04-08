UPDATE c1_dictionary_type SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
dictionary_type_id = ANY(string_to_array(:dictionaryTypeIds, ','))