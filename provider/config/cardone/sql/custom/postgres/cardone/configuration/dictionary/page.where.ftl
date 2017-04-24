<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
${prefixName?string('WHERE ', 'AND ')}(t.DICTIONARY_TYPE_CODE = :dictionaryTypeCode OR Exists(select 1 from c1_department e where e.DICTIONARY_TYPE_CODE = t.DICTIONARY_TYPE_CODE and :dictionaryTypeCode = ANY(string_to_array(e.parent_tree_code, ','))))
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(dictionaryTypeTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:dictionaryTypeTreeName in t.DICTIONARY_TYPE_CODE) > 0 OR Exists(select 1 from C1_DICTIONARY_TYPE e where e.DICTIONARY_TYPE_CODE = t.DICTIONARY_TYPE_CODE and POSITION(:dictionaryTypeTreeName in e.NAME) > 0))
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dictionaryCode)>
${prefixName?string('WHERE ', 'AND ')}t.DICTIONARY_CODE = :dictionaryCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(name)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:name in t.DICTIONARY_CODE) > 0 OR POSITION(:name in t.NAME) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}((t.BEGIN_DATE is null OR t.BEGIN_DATE >= :startTime) OR (t.END_DATE is null OR t.END_DATE >= :startTime))
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}((t.BEGIN_DATE is null OR t.BEGIN_DATE <= :endTime) OR (t.END_DATE is null OR t.END_DATE <= :endTime))
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