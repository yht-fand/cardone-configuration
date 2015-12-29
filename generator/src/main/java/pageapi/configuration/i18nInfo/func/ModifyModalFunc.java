package pageapi.configuration.i18nInfo.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 国际化信息 - 修改
 */
@Component("/configuration/i18nInfo/modifyModal.json")
public class ModifyModalFunc implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
