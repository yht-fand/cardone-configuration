package top.cardone.configuration.func.i18nInfo.webapi.v1;

import org.springframework.stereotype.Component;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 国际化信息 - 复合
 */
@Component("/web-api/v1/configuration/i18nInfo/m0004.json")
public class M0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        return ApplicationContextHolder.getBean(I18nInfoService.class).findOne(map);
    }
}