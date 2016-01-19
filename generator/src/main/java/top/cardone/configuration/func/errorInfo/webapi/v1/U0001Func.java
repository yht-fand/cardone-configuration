package top.cardone.configuration.func.errorInfo.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 错误信息 - 修改
 */
@Component("/web-api/v1/configuration/errorInfo/u0001.json")
public class U0001Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }
}