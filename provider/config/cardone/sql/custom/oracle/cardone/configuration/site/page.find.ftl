SELECT T.*
FROM C1_SITE t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)