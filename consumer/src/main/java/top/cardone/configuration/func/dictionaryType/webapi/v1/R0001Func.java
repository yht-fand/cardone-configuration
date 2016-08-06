package top.cardone.configuration.func.dictionaryType.webapi.v1;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.ListUtils;
import top.cardone.context.util.MapUtils;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 字典类别 - 查询
 */
@Component("/web-api/v1/configuration/dictionaryType/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> inputConfigTable;
    private Table<String, String, String> outConfigTable;

    public R0001Func() {
        inputConfigTable = HashBasedTable.create();

        inputConfigTable.put("dictionaryTypeCode", "funcBeanId", "escapeSqlFunc");
        inputConfigTable.put("parentCode", "funcBeanId", "escapeSqlFunc");

        outConfigTable = HashBasedTable.create();

        outConfigTable.put("DICTIONARY_TYPE_ID", "newName", "dictionaryTypeId");
        outConfigTable.put("SYSTEM_INFO_CODE", "newName", "systemInfoCode");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("SITE_CODE", "newName", "siteCode");
        outConfigTable.put("SITE_NAME", "newName", "siteName");
        outConfigTable.put("PARENT_CODE", "newName", "parentCode");
        outConfigTable.put("PARENT_NAME", "newName", "parentName");
        outConfigTable.put("DICTIONARY_TYPE_CODE", "newName", "dictionaryTypeCode");
        outConfigTable.put("NAME", "newName", "name");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdDate");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }

    @Override
    public Object func(Map<String, Object> inputMap) {
        inputMap.putAll(MapUtils.newHashMap(inputMap, inputConfigTable));

        Page<Map<String, Object>> dictionaryTypePage = ApplicationContextHolder.getBean(DictionaryTypeService.class).pageByCode(inputMap);

        List<Map<String, Object>> newContent = ListUtils.newArrayList(dictionaryTypePage.getContent(), outConfigTable);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, dictionaryTypePage.getTotalElements());
    }
}