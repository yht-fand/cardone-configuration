UPDATE c1_navigation SET END_DATE = NOW(), DATA_STATE_CODE = '0' WHERE INSTR(:navigationIds, NAVIGATION_ID) > 0