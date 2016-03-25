package top.cardone.configuration.func.site.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SiteDto;
import top.cardone.configuration.service.SiteService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Site - 查询
 */
@Component("/web-api/v1/configuration/site/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        SiteDto siteDto = ApplicationContextHolder.getBean(SiteService.class).findOne(SiteDto.class, map);

        return this.toMap(siteDto);
    }

    private Map<String, Object> toMap(SiteDto siteDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}