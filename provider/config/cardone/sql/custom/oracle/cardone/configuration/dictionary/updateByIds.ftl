UPDATE C1_DICTIONARY SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:dictionaryIds||',', ','||DICTIONARY_ID||',') > 0