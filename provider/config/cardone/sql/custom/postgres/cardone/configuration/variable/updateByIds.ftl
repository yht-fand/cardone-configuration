UPDATE "c1_variable" SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE
variable_id = ANY(string_to_array(:variableIds, ','))