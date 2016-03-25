package top.cardone.configuration.func.dictionaryType.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * DictionaryType - 索引
 */
@Component("/configuration/dictionaryType/index.json")
public class IndexFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}