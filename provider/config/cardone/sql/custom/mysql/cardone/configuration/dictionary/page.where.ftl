<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
WHERE 1 = 1
<#if StringUtils.isNotBlank(dictionaryTypeCode)>
AND t.`DICTIONARY_TYPE_CODE` = :dictionaryTypeCode
<#elseif  StringUtils.isNotBlank(dictionaryTypeTreeName)>
AND (LOCATE(:dictionaryTypeTreeName, d.`PARENT_CODE`) OR LOCATE(:dictionaryTypeTreeName, d.`PARENT_TREE_CODE`) OR LOCATE(:dictionaryTypeTreeName, d.`PARENT_TREE_NAME`) OR LOCATE(:dictionaryTypeTreeName, t.`DICTIONARY_TYPE_CODE`) OR LOCATE(:dictionaryTypeTreeName, d.`NAME`))
</#if>
<#if StringUtils.isNotBlank(dictionaryCode)>
AND t.`DICTIONARY_CODE` = :dictionaryCode
<#elseif  StringUtils.isNotBlank(name)>
AND (LOCATE(:name, t.`DICTIONARY_CODE`) OR LOCATE(:name, t.`NAME`))
</#if>
<#if StringUtils.isNotBlank(startTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` >= :startTime) OR (t.`END_DATE` is null OR t.`END_DATE` >= :startTime))
</#if>
<#if StringUtils.isNotBlank(endTime)>
AND ((t.`BEGIN_DATE` is null OR t.`BEGIN_DATE` <= CONCAT(:endTime, ' 59:59:59')) OR (t.`END_DATE` is null OR t.`END_DATE` <= CONCAT(:endTime, ' 59:59:59')))
</#if>
<#if StringUtils.isNotBlank(flagCode)>
AND t.`FLAG_CODE` = :flagCode
</#if>
<#if StringUtils.isNotBlank(stateCode)>
AND t.`STATE_CODE` = :stateCode
</#if>
<#if StringUtils.isNotBlank(dataStateCode)>
AND t.`DATA_STATE_CODE` = :dataStateCode
</#if>
