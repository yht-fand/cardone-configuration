<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>
<#assign ObjectUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ObjectUtils"]>
<#assign SecurityUtils = beansWrapperFn.getStaticModels()["org.apache.shiro.SecurityUtils"]>

<#macro permissionSql prefixName = true role="administrator" permission="*:view:*"  permission_departments="" departmentColumnName="T.DEPARTMENT_CODE" permission_users="" userColumnName="T.personal_code" permissions="" permissionColumnName="T.CODE" >
    <#if permission_departments == "*" || permission_users == "*"|| permissions == "*" || SecurityUtils.getSubject().hasRole(role)|| SecurityUtils.getSubject().isPermitted(permission)>
        <#return >
    </#if>

    <#if cardone.StringUtils.isNotBlank(permission_departments) || cardone.StringUtils.isNotBlank(permission_users) || cardone.StringUtils.isNotBlank(permission)>
        ${prefixName?string('WHERE (', 'AND (')}
        <#assign andOrPrefixName = true>
        <#if cardone.StringUtils.isNotBlank(permission_departments)>
        ${andOrPrefixName?string('', ' or ')}${departmentColumnName} = ANY(string_to_array(:permission_departments, ','))
            <#assign andOrPrefixName = false>
        </#if>
        <#if cardone.StringUtils.isNotBlank(permission_users)>
        ${andOrPrefixName?string('', ' or ')}${userColumnName} = ANY(string_to_array(:permission_users, ','))
            <#assign andOrPrefixName = false>
        </#if>
        <#if cardone.StringUtils.isNotBlank(permission)>
        ${andOrPrefixName?string('', ' or ')}${permissionColumnName} = ANY(string_to_array(:permissions, ','))
            <#assign andOrPrefixName = false>
        </#if>
    )
    </#if>
</#macro>
