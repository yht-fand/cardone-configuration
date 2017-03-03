<#assign StringUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.StringUtils"]>
<#assign ArrayUtils = beansWrapperFn.getStaticModels()["org.apache.commons.lang3.ArrayUtils"]>

<#macro defaultIfBlank str="" defaultSt="">${StringUtils.contains(str, '?')? string(defaultSt, str!defaultSt)}</#macro>
