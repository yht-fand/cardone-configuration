DELETE FROM C1_NAVIGATION WHERE
INSTR(','||:navigationIds||',', ','||NAVIGATION_ID||',') > 0
