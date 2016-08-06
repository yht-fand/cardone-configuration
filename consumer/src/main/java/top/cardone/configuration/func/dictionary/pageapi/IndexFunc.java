package top.cardone.configuration.func.dictionary.pageapi;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典 - 索引
 */
@Component("/configuration/dictionary/index.json")
public class IndexFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}