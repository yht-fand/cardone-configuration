package top.cardone.configuration.func.errorInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 错误信息 - 批量创建
 */
@Component("/web-api/v1/configuration/errorInfo/c0002.json")
public class C0002Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}
