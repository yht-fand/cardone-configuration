UPDATE C1_DICTIONARY_ITEM SET END_DATE = SYSDATE, DATA_STATE_CODE = '0' WHERE
INSTR(','||:dictionaryItemIds||',', ','||DICTIONARY_ITEM_ID||',') > 0