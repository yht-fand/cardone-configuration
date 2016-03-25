package top.cardone.configuration.func.errorInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * ErrorInfo - 删除
 */
@Component("/web-api/v1/configuration/errorInfo/d0001.json")
public class D0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(ErrorInfoService.class).delete(map);
    }
}
