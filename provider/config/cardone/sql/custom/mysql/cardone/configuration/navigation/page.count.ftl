SELECT
COUNT(1)
FROM c1_navigation t
left join `c1_navigation` p on (p.`NAVIGATION_CODE` = t.`PARENT_CODE`)
<#include "page.where.ftl">