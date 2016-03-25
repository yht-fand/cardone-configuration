package top.cardone.configuration.func.dictionaryType.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 创建
 */
@Component("/web-api/v1/configuration/dictionaryType/c0003.json")
public class C0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryTypeService.class).save(map);
    }
}
