package top.cardone.configuration.func.dictionaryType.pageapi;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 修改
 */
@Component("/configuration/dictionaryType/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> outConfigTable;

    public ModifyModalFunc() {
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
        outConfigTable.put("CREATED_DATE", "newName", "createdByName");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }

    @Override
    public Object func(Map<String, Object> map) {
        String dictionaryTypeId = MapUtils.getString(map, "dictionaryTypeId");

        if (StringUtils.isBlank(dictionaryTypeId)) {
            throw new CodeException("字典类别标识不能为空值");
        }

        Map<String, Object> out = ApplicationContextHolder.getBean(DictionaryTypeService.class).findOneByDictionaryTypeId(dictionaryTypeId);

        return MapUtils.newHashMap(out,outConfigTable);
    }
}
