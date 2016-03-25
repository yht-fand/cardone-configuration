package top.cardone.configuration.func.dictionary.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Dictionary - 添加
 */
@Component("/configuration/dictionary/addModal.json")
public class AddModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
