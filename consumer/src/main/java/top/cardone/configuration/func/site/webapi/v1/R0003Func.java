package top.cardone.configuration.func.site.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SiteDto;
import top.cardone.configuration.service.SiteService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * Site - 查询分页
 */
@Component("/web-api/v1/configuration/site/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<SiteDto> siteDtoPage = ApplicationContextHolder.getBean(SiteService.class).page(SiteDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(siteDtoPage.getContent()), map, siteDtoPage.getTotalElements()));
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