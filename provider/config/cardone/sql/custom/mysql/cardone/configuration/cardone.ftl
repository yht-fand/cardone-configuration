<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>
<#assign ObjectUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ObjectUtils"]>
<#assign SecurityUtils = beansWrapperFn.getStaticModels()["org.apache.shiro.SecurityUtils"]>

<#macro permissionSql permission_departments="" departmentColumnName="T.DEPARTMENT_CODE" permission_users="" userColumnName="T.CREATED_BY_CODE" permissions="" permissionColumnName="T.CODE">
    <#if SecurityUtils.getSubject().hasRole("administrator")>
        <#return >
    </#if>
    <#assign prefixName = 'AND ('>
    <#if StringUtils.isNotBlank(permission_departments) && StringUtils.isNotBlank(departmentColumnName)>
    ${prefixName}FIND_IN_SET(${departmentColumnName}, :permission_departments)
        <#assign prefixName = " OR ">
    </#if>
    <#if StringUtils.isNotBlank(permission_users) && StringUtils.isNotBlank(userColumnName)>
    ${prefixName}FIND_IN_SET(${userColumnName}, :permission_users)
        <#assign prefixName = " OR ">
    </#if>
    <#if StringUtils.isNotBlank(permissions) && StringUtils.isNotBlank(permissionColumnName)>
    ${prefixName}FIND_IN_SET(${permissionColumnName}, :permissions)
        <#assign prefixName = " OR ">
    </#if>
    <#if prefixName != 'AND ('>)</#if>
</#macro>
