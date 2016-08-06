package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.ListUtils;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;
import java.util.List;
import java.util.Map;

/**
 * 字典 - 查询
 */
@Component("/web-api/v1/configuration/dictionary/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> inputConfigTable;
    private Table<String, String, String> outConfigTable;

    @Override
    public Object func(Map<String, Object> inputMap) {
        inputMap.putAll(top.cardone.context.util.MapUtils.newHashMap(inputMap, inputConfigTable));
        Page<Map<String, Object>> dictionaryPage = ApplicationContextHolder.getBean(DictionaryService.class).page(inputMap);
        List<Map<String, Object>> newContent = ListUtils.newArrayList(dictionaryPage.getContent(), outConfigTable);
        return ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, dictionaryPage.getTotalElements());
    }

    public R0001Func() {
        inputConfigTable = HashBasedTable.create();
        inputConfigTable.put("dictionaryCode", "funcBeanId", "escapeSqlFunc");
        inputConfigTable.put("dictionaryTypeCode", "funcBeanId", "escapeSqlFunc");
        outConfigTable = HashBasedTable.create();
        outConfigTable.put("DICTIONARY_ID", "newName", "dictionaryId");
        outConfigTable.put("SYSTEM_INFO_CODE", "newName", "systemInfoCode");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("SITE_CODE", "newName", "siteCode");
        outConfigTable.put("SITE_NAME", "newName", "siteName");
        outConfigTable.put("DICTIONARY_TYPE_CODE", "newName", "dictionaryTypeCode");
        outConfigTable.put("DICTIONARY_TYPE_NAME", "newName", "dictionaryTypeName");
        outConfigTable.put("DICTIONARY_CODE", "newName", "dictionaryCode");
        outConfigTable.put("NAME", "newName", "name");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdDate");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }
}