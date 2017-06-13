<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(parentCode)>
${prefixName?string('WHERE ', 'AND ')}:parentCode = ANY(string_to_array(t.parent_tree_code, ','))
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(parentTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:parentTreeName in t.PARENT_CODE) > 0 OR POSITION(:parentTreeName in t.PARENT_TREE_CODE) > 0 OR POSITION(:parentTreeName in t.PARENT_TREE_NAME) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
${prefixName?string('WHERE ', 'AND ')}t.dictionary_type_CODE = :dictionaryTypeCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(name)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:name in t.dictionary_type_CODE) > 0 OR POSITION(:name in t.NAME) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}(t.BEGIN_DATE >= :startTime OR t.END_DATE >= :startTime)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}(t.BEGIN_DATE <= :endTime OR t.END_DATE <= :endTime)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(flagCode)>
${prefixName?string('WHERE ', 'AND ')}t.FLAG_CODE = :flagCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(stateCode)>
${prefixName?string('WHERE ', 'AND ')}t.STATE_CODE = :stateCode
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dataStateCode)>
${prefixName?string('WHERE ', 'AND ')}t.DATA_STATE_CODE = :dataStateCode
    <#assign prefixName = false>
</#if>