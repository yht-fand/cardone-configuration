DELETE FROM C1_SYSTEM_INFO WHERE
INSTR(','||:systemInfoIds||',', ','||SYSTEM_INFO_ID||',') > 0
