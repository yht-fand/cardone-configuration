SELECT t.I18N_INFO_CODE, t."content" FROM c1_i18n_info t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.content, :term) > 0 OR strpos(t.I18N_INFO_CODE, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.I18N_INFO_CODE
LIMIT 20