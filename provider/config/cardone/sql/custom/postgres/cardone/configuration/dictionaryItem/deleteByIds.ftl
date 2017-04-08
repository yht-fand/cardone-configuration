DELETE FROM c1_dictionary_item WHERE
dictionary_item_id = ANY(string_to_array(:dictionaryItemIds, ','))