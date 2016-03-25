package top.cardone.configuration.func.site.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SiteDto;
import top.cardone.configuration.service.SiteService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Site - 查询列表
 */
@Component("/web-api/v1/configuration/site/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<SiteDto> siteDtoList = ApplicationContextHolder.getBean(SiteService.class).findList(SiteDto.class, map);

        return this.toMapList(siteDtoList);
    }

    private List<Map<String, Object>> toMapList(List<SiteDto> siteDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (SiteDto siteDto : siteDtoList) {
            mapList.add(this.toMap(siteDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(SiteDto siteDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}