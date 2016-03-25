package top.cardone.configuration.func.systemInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.SystemInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 系统信息 - 创建
 */
@Component("/web-api/v1/configuration/systemInfo/c0001.json")
public class C0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(SystemInfoService.class).save(map);
    }
}
