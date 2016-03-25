package top.cardone.configuration.func.site.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.SiteService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 站点 - 删除
 */
@Component("/web-api/v1/configuration/site/d0003.json")
public class D0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(SiteService.class).delete(map);
    }
}
