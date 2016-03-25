package top.cardone.configuration.func.dictionaryType.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 复合
 */
@Component("/web-api/v1/configuration/dictionaryType/m0004.json")
public class M0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryTypeService.class).findOne(map);
    }
}