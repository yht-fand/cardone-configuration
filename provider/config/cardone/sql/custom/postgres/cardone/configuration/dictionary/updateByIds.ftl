UPDATE c1_dictionary SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
dictionary_id = ANY(string_to_array(:dictionaryIds, ','))