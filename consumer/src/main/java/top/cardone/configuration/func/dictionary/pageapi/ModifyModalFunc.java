package top.cardone.configuration.func.dictionary.pageapi;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典 - 修改
 */
@Component("/configuration/dictionary/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> outConfigTable;
    @Override
    public Object func(Map<String, Object> map) {
        String dictionaryId = top.cardone.context.util.MapUtils.getString(map, "dictionaryId");
        if (StringUtils.isBlank(dictionaryId)) {
            throw new CodeException("字典类别标识不能为空值");
        }
        Map<String,Object> out = ApplicationContextHolder.getBean(DictionaryService.class).findOneByDictionaryId(dictionaryId);
        if(CollectionUtils.isEmpty(out)){
            throw new CodeException("字典数据不存在");
        }
        return top.cardone.context.util.MapUtils.newHashMap(out,outConfigTable);
    }
    public ModifyModalFunc() {
        outConfigTable = HashBasedTable.create();

        outConfigTable.put("DICTIONARY_ID", "newName", "dictionaryId");
        outConfigTable.put("SYSTEM_INFO_CODE", "newName", "systemInfoCode");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("SITE_CODE", "newName", "siteCode");
        outConfigTable.put("SITE_NAME", "newName", "siteName");
        outConfigTable.put("DICTIONARY_CODE", "newName", "dictionaryCode");
        outConfigTable.put("DICTIONARY_TYPE_CODE", "newName", "dictionaryTypeCode");
        outConfigTable.put("DICTIONARY_TYPE_NAME", "newName", "dictionaryTypeName");
        outConfigTable.put("NAME", "newName", "name");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdByName");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }
}
