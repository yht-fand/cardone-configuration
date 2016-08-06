package top.cardone.configuration.func.i18nInfo.pageapi;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;
import java.util.Map;

/**
 * 国际化信息 - 修改
 */
@Component("/configuration/i18nInfo/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> outConfigTable;

    public ModifyModalFunc() {
        outConfigTable = HashBasedTable.create();

        outConfigTable.put("I18N_INFO_ID", "newName", "i18nInfoId");
        outConfigTable.put("I18N_INFO_CODE", "newName", "i18nInfoCode");
        outConfigTable.put("SYSTEM_INFO_CODE", "newName", "systemInfoCode");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("SITE_CODE", "newName", "siteCode");
        outConfigTable.put("SITE_NAME", "newName", "siteName");
        outConfigTable.put("TYPE_CODE", "newName", "typeCode");
        outConfigTable.put("TYPE_NAME", "newName", "typeName");
        outConfigTable.put("CONTENT", "newName", "content");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdByName");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }

    @Override
    public Object func(Map<String, Object> map) {
        String i18nInfoId = top.cardone.context.util.MapUtils.getString(map, "i18nInfoId");
        if (StringUtils.isBlank(i18nInfoId)) {
            throw new CodeException("国际化信息标识不能为空值");
        }
        Map<String, Object> out = ApplicationContextHolder.getBean(I18nInfoService.class).findOneByI18nInfoId(i18nInfoId);
        return top.cardone.context.util.MapUtils.newHashMap(out,outConfigTable);
    }
}
