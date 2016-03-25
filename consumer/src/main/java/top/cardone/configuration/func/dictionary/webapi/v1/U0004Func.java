package top.cardone.configuration.func.dictionary.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Dictionary - 修改
 */
@Component("/web-api/v1/configuration/dictionary/u0004.json")
public class U0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryService.class).update(map);
    }
}