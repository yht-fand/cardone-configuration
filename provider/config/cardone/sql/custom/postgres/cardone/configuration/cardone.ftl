<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>
<#assign ObjectUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ObjectUtils"]>
<#assign SecurityUtils = beansWrapperFn.getStaticModels()["org.apache.shiro.SecurityUtils"]>

<#macro permissionSql role="administrator" permission="*:view:*"  permission_departments="" departmentColumnName="T.DEPARTMENT_CODE" permission_users="" userColumnName="T.CREATED_BY_CODE" permissions="" permissionColumnName="T.CODE">
    <#if SecurityUtils.getSubject().hasRole(role) || SecurityUtils.getSubject().isPermitted(permission)>
        <#return >
    </#if>
    <#assign prefixName = 'AND ('>
    <#if StringUtils.isNotBlank(permission_departments) && StringUtils.isNotBlank(departmentColumnName)>
    ${prefixName}${departmentColumnName} = ANY(string_to_array(:permission_departments, ','))
        <#assign prefixName = " OR ">
    </#if>
    <#if StringUtils.isNotBlank(permission_users) && StringUtils.isNotBlank(userColumnName)>
    ${prefixName}${userColumnName} = ANY(string_to_array(:permission_users, ','))
        <#assign prefixName = " OR ">
    </#if>
    <#if StringUtils.isNotBlank(permissions) && StringUtils.isNotBlank(permissionColumnName)>
    ${prefixName}${permissionColumnName} = ANY(string_to_array(:permissions, ','))
        <#assign prefixName = " OR ">
    </#if>
    <#if prefixName != 'AND ('>)</#if>
</#macro>
