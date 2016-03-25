package top.cardone.configuration.func.systemInfo.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * SystemInfo - 修改
 */
@Component("/configuration/systemInfo/modifyModal.json")
public class ModifyModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}
