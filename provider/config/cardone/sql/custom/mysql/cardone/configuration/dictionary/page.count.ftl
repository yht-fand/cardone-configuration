SELECT
COUNT(1)
FROM
`c1_dictionary` t
LEFT JOIN `c1_dictionary_type` d ON(d.`DICTIONARY_TYPE_CODE` = t.`DICTIONARY_TYPE_CODE`)
<#include "page.where.ftl">