SELECT T.*
FROM C1_DICTIONARY_ITEM t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)