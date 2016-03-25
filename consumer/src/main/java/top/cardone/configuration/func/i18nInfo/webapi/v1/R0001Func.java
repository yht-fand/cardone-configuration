package top.cardone.configuration.func.i18nInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.I18nInfoDto;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * I18nInfo - 查询
 */
@Component("/web-api/v1/configuration/i18nInfo/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        I18nInfoDto i18nInfoDto = ApplicationContextHolder.getBean(I18nInfoService.class).findOne(I18nInfoDto.class, map);

        return this.toMap(i18nInfoDto);
    }

    private Map<String, Object> toMap(I18nInfoDto i18nInfoDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}