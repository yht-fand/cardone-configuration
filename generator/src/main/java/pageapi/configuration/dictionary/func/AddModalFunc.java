package pageapi.configuration.dictionary.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典 - 添加
 */
@Component("/configuration/dictionary/addModal.json")
public class AddModalFunc implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
