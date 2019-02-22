DELETE FROM C1_VARIABLE WHERE
INSTR(','||:variableIds||',', ','||VARIABLE_ID||',') > 0
