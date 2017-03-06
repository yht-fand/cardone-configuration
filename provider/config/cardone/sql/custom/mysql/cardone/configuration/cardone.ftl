<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>
<#assign SecurityUtils = beansWrapperFn.getStaticModels()["org.apache.shiro.SecurityUtils"]>

<#macro permissionSql permission_departments="" departmentColumnName="T.DEPARTMENT_CODE" permission_users="" userColumnName="T.CREATED_BY_CODE" permissions="" permissionsColumnName="T.CODE" loginUserCode=SecurityUtils.getSubject().getPrincipal()>
    <#if loginUserCode == "admin1">
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
    <#if StringUtils.isNotBlank(permission_departments) && StringUtils.isNotBlank(departmentColumnName)>
    ${prefixName}FIND_IN_SET(${departmentColumnName}, :permission_departments)
        <#assign prefixName = " OR ">
    </#if>
    <#if prefixName != 'AND ('>)</#if>
</#macro>
