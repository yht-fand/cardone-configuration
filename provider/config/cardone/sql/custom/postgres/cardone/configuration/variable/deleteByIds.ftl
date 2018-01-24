DELETE FROM "c1_variable" WHERE
variable_id = ANY(string_to_array(:variableIds, ','))