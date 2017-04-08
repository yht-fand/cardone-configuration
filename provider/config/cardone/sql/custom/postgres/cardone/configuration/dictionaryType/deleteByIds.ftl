DELETE FROM c1_dictionary_type WHERE
dictionary_type_id = ANY(string_to_array(:dictionaryTypeIds, ','))