SELECT T.*
FROM C1_I18N_INFO t
<#include "page.where.ftl">
rownum between :offset and (:offset + :pageSize)