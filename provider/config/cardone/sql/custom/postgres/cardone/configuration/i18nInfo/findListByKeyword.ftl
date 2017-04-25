SELECT d.I18NINFO_CODE, d.NAME FROM c1_i18n_info d
<#if cardone.StringUtils.isNotBlank(term)>
WHERE strpos(d.NAME, :term) > 0 OR strpos(d.I18NINFO_CODE, :term) > 0
</#if>
ORDER BY d.ORDER_, d.I18NINFO_CODE
LIMIT 20