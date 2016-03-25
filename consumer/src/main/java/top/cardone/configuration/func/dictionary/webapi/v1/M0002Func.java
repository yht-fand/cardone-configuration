package top.cardone.configuration.func.dictionary.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Dictionary - 复合
 */
@Component("/web-api/v1/configuration/dictionary/m0002.json")
public class M0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(DictionaryService.class).findOne(map);
    }
}