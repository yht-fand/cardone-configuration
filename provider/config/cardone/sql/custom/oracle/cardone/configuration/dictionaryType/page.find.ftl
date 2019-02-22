SELECT T.*
FROM C1_DICTIONARY_TYPE t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)