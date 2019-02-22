DELETE FROM C1_DICTIONARY WHERE
INSTR(','||:dictionaryIds||',', ','||DICTIONARY_ID||',') > 0
