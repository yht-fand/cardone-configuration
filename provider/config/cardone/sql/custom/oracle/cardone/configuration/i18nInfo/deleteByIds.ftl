DELETE FROM C1_I18N_INFO WHERE
INSTR(','||:i18nInfoIds||',', ','||I18N_INFO_ID||',') > 0
