SELECT T.*
FROM C1_VARIABLE t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)