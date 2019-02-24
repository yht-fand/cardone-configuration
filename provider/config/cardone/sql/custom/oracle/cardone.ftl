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
<#if cardone.StringUtils.isNotBlank(permission_departments)>
${andOrPrefixName?string('', ' or ')}${cardone.StringUtils.containsAny(permission_departments, ",")?string("INSTR(','||:permission_departments||',', ','||" + departmentColumnName + "||',') > 0", departmentColumnName + " = :permission_departments")}
<#assign andOrPrefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(permission_users)>
${andOrPrefixName?string('', ' or ')}${cardone.StringUtils.containsAny(permission_users, ",")?string("INSTR(','||:permission_users||',', ','||" + userColumnName + "||',') > 0", userColumnName + " = :permission_users")}
<#assign andOrPrefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(permissions)>
${andOrPrefixName?string('', ' or ')}${cardone.StringUtils.containsAny(permissions, ",")?string("INSTR(','||:permissions||',', ','||" + permissionColumnName + "||',') > 0", permissionColumnName + " = :permissions")}
<#assign andOrPrefixName = false>
</#if>
)
</#if>
</#macro>