package top.cardone.configuration.func.site.pageapi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Site - 添加
 */
@Component("/configuration/site/addModal.json")
public class AddModalFunc implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return null;
    }
}