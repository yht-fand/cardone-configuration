UPDATE t_site SET END_DATE = NOW() WHERE INSTR(:ids, siteId) > 0