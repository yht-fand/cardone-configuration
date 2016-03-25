package top.cardone.configuration.func.dictionaryType.webapi.v1;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 字典类别 - 批量删除
 */
@Component("/web-api/v1/configuration/dictionaryType/d0002.json")
public class D0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<Object> deleteList = (List<Object>) MapUtils.getObject(map, "datas");

        return ApplicationContextHolder.getBean(DictionaryTypeService.class).deleteList(deleteList);
    }
}
