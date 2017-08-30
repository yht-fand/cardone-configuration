<#assign prefixName = true>
<#if cardone.StringUtils.isNotBlank(dictionaryTypeId)>
${prefixName?string('WHERE ', 'AND ')}(t.DICTIONARY_TYPE_ID = :dictionaryTypeId OR :dictionaryTypeId = ANY(string_to_array(d.parent_tree_id, ',')))
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(dictionaryTypeCode)>
${prefixName?string('WHERE ', 'AND ')}(t.DICTIONARY_TYPE_CODE = :dictionaryTypeCode OR :dictionaryTypeCode = ANY(string_to_array(d.parent_tree_code, ',')))
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(dictionaryTypeTreeName)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:dictionaryTypeTreeName in t.DICTIONARY_TYPE_CODE) > 0 OR POSITION(:dictionaryTypeTreeName in d.NAME) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.StringUtils.isNotBlank(dictionaryId)>
${prefixName?string('WHERE ', 'AND ')}t.DICTIONARY_ID = :dictionaryId
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(dictionaryCode)>
${prefixName?string('WHERE ', 'AND ')}t.DICTIONARY_CODE = :dictionaryCode
    <#assign prefixName = false>
<#elseif cardone.StringUtils.isNotBlank(name)>
${prefixName?string('WHERE ', 'AND ')}(POSITION(:name in t.DICTIONARY_CODE) > 0 OR POSITION(:name in t.NAME) > 0)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(startTime)>
${prefixName?string('WHERE ', 'AND ')}(t.BEGIN_DATE >= :startTime OR t.END_DATE >= :startTime)
    <#assign prefixName = false>
</#if>
<#if cardone.ObjectUtils.anyNotNull(endTime)>
${prefixName?string('WHERE ', 'AND ')}(t.BEGIN_DATE < :endTime OR t.END_DATE < :endTime)
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