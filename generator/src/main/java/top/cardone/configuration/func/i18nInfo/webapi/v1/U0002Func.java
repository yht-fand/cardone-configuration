package top.cardone.configuration.func.i18nInfo.webapi.v1;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 国际化信息 - 批量修改
 */
@Component("/web-api/v1/configuration/i18nInfo/u0002.json")
public class U0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<Object> updateList = (List<Object>) MapUtils.getObject(map, "datas");

        return ApplicationContextHolder.getBean(I18nInfoService.class).updateList(updateList);
    }
}
