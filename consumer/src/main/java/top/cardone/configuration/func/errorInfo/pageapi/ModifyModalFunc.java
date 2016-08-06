package top.cardone.configuration.func.errorInfo.pageapi;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 错误信息 - 修改
 */
@Component("/configuration/errorInfo/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> outConfigTable;

    public ModifyModalFunc() {
        outConfigTable = HashBasedTable.create();
        outConfigTable.put("ERROR_INFO_ID", "newName", "errorInfoId");
        outConfigTable.put("TYPE_CODE", "newName", "typeCode");
        outConfigTable.put("TYPE_NAME", "newName", "typeName");
        outConfigTable.put("CONTENT", "newName", "content");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("ERROR_INFO_CODE", "newName", "errorInfoCode");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdByName");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }

    @Override
    public Object func(Map<String, Object> map) {
        String errorInfoId = top.cardone.context.util.MapUtils.getString(map, "errorInfoId");
        if (StringUtils.isBlank(errorInfoId)) {
            throw new CodeException("错误信息不能为空值");
        }
        Map<String, Object> out = ApplicationContextHolder.getBean(ErrorInfoService.class).findOneByErrorInfoId(errorInfoId);
        return top.cardone.context.util.MapUtils.newHashMap(out, outConfigTable);
    }
}
