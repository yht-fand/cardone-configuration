DELETE FROM c1_dictionary WHERE
dictionary_id = ANY(string_to_array(:dictionaryIds, ','))