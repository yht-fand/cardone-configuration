package top.cardone.configuration.func.errorInfo.webapi.v1;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.ListUtils;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 错误信息 - 查询
 */
@Component("/web-api/v1/configuration/errorInfo/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    private Table<String, String, String> inputConfigTable;
    private Table<String, String, String> outConfigTable;

    public R0001Func() {
        inputConfigTable = HashBasedTable.create();
        inputConfigTable.put("errorInfoCode", "funcBeanId", "escapeSqlFunc");   //模糊查询字段

        outConfigTable = HashBasedTable.create();
        outConfigTable.put("ERROR_INFO_ID", "newName", "errorInfoId");
        outConfigTable.put("TYPE_CODE", "newName", "typeCode");
        outConfigTable.put("TYPE_NAME", "newName", "typeName");
        outConfigTable.put("CONTENT", "newName", "content");
        outConfigTable.put("SYSTEM_INFO_NAME", "newName", "systemInfoName");
        outConfigTable.put("ERROR_INFO_CODE", "newName", "errorInfoCode");
        outConfigTable.put("CREATED_BY_CODE", "newName", "createdByCode");
        outConfigTable.put("CREATED_BY_NAME", "newName", "createdByName");
        outConfigTable.put("CREATED_DATE", "newName", "createdDate");
        outConfigTable.put("LAST_MODIFIED_BY_CODE", "newName", "lastModifiedByCode");
        outConfigTable.put("LAST_MODIFIED_BY_NAME", "newName", "lastModifiedByName");
        outConfigTable.put("LAST_MODIFIED_DATE", "newName", "lastModifiedDate");
    }

    @Override
    public Object func(Map<String, Object> inputMap) {
        inputMap.putAll(top.cardone.context.util.MapUtils.newHashMap(inputMap, inputConfigTable));

        Page<Map<String, Object>> erroInfoPage = ApplicationContextHolder.getBean(ErrorInfoService.class).page(inputMap);

        List<Map<String, Object>> newContent = ListUtils.newArrayList(erroInfoPage.getContent(), outConfigTable);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(newContent, inputMap, erroInfoPage.getTotalElements());
    }
}