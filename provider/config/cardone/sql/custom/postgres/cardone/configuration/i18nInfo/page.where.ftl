<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(i18nInfoCode)>
${prefixName?string('WHERE ', 'AND ')}t.i18n_info_code = :i18nInfoCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(content)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:content in t.content) > 0 OR POSITION(:content in t.i18n_info_code) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(typeCode)>
${prefixName?string('WHERE ', 'AND ')}t.type_Code = :typeCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(typeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:typeCode in t.type_Code) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(language)>
${prefixName?string('WHERE ', 'AND ')}t.language = :language
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(languageName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:languageName in t.language) > 0)
    <#assign prefixName = false>
</#if>
