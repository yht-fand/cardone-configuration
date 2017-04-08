UPDATE c1_dictionary_item SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
dictionary_item_id = ANY(string_to_array(:dictionaryItemIds, ','))