DELETE FROM C1_SITE WHERE
INSTR(','||:siteIds||',', ','||SITE_ID||',') > 0
