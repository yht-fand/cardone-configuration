<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>
<#assign ObjectUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ObjectUtils"]>
<#assign SecurityUtils = beansWrapperFn.getStaticModels()["org.apache.shiro.SecurityUtils"]>

<#macro permissionSql prefixName = true permission_departments="" departmentColumnName="t.DEPARTMENT_CODE" permission_users="" userColumnName="t.personal_code" permissions="" permissionColumnName="t.personal_code">
    <#if permission_departments == "*" || permission_users == "*"|| permissions == "*">
        <#return >
    </#if>

    <#if cardone.StringUtils.isNotBlank(permission_departments) || cardone.StringUtils.isNotBlank(permission_users) || cardone.StringUtils.isNotBlank(permissions)>
        ${prefixName?string('WHERE (', 'AND (')}
        <#assign andOrPrefixName = true>
        <#if permission_departments == "#permissionsEmpty#">
        ${andOrPrefixName?string('', ' or ')}${departmentColumnName} = :permission_departments)
            <#assign andOrPrefixName = false>
        <#elseif cardone.StringUtils.isNotBlank(permission_departments)>
        ${andOrPrefixName?string('', ' or ')}${departmentColumnName} = ANY(string_to_array(:permission_departments, ','))
            <#assign andOrPrefixName = false>
        </#if>
        <#if permission_users == "#permissionsEmpty#">
        ${andOrPrefixName?string('', ' or ')}${userColumnName} = :permission_users)
            <#assign andOrPrefixName = false>
        <#elseif cardone.StringUtils.isNotBlank(permission_users)>
        ${andOrPrefixName?string('', ' or ')}${userColumnName} = ANY(string_to_array(:permission_users, ','))
            <#assign andOrPrefixName = false>
        </#if>
        <#if permissions == "#permissionsEmpty#">
        ${andOrPrefixName?string('', ' or ')}${permissionColumnName} = :permissions)
            <#assign andOrPrefixName = false>
        <#elseif cardone.StringUtils.isNotBlank(permissions)>
        ${andOrPrefixName?string('', ' or ')}${permissionColumnName} = ANY(string_to_array(:permissions, ','))
            <#assign andOrPrefixName = false>
        </#if>
    )
    </#if>
</#macro>
