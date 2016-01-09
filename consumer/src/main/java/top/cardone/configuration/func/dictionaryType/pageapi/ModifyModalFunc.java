package top.cardone.configuration.func.dictionaryType.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 修改
 */
@Component("/configuration/dictionaryType/modifyModal.json")
public class ModifyModalFunc implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
