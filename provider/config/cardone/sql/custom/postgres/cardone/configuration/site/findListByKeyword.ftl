SELECT t.SITE_CODE, t.NAME FROM c1_site t
where t.state_code ='1' and t.data_state_code = '1'
<#if cardone.StringUtils.isBlank(notTerm) >
    <#if cardone.StringUtils.isNotBlank(term)>
    and (strpos(t.NAME, :term) > 0 OR strpos(t.SITE_CODE, :term) > 0)
    </#if>
</#if>
ORDER BY t.ORDER_BY_, t.SITE_CODE
LIMIT 20