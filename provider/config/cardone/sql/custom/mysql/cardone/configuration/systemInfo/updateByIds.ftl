UPDATE t_system_info SET END_DATE = NOW() WHERE INSTR(:ids, systemInfoId) > 0