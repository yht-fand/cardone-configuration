SELECT T.*
FROM C1_NAVIGATION t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)