SELECT T.*
FROM C1_DICTIONARY t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)