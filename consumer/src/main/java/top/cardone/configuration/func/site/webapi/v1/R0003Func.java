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
 * 站点 - 查询分页
 */
@Component("/web-api/v1/configuration/site/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<SiteDto> siteDtoPage = ApplicationContextHolder.getBean(SiteService.class).page(SiteDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(siteDtoPage.getContent()), map, siteDtoPage.getTotalElements());
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

        map.put("beginDate", siteDto.getBeginDate());
        map.put("content", siteDto.getContent());
        map.put("createdByCode", siteDto.getCreatedByCode());
        map.put("createdDate", siteDto.getCreatedDate());
        map.put("dataStateCode", siteDto.getDataStateCode());
        map.put("departmentCode", siteDto.getDepartmentCode());
        map.put("endDate", siteDto.getEndDate());
        map.put("explain", siteDto.getExplain());
        map.put("lastModifiedByCode", siteDto.getLastModifiedByCode());
        map.put("lastModifiedDate", siteDto.getLastModifiedDate());
        map.put("name", siteDto.getName());
        map.put("orgCode", siteDto.getOrgCode());
        map.put("permissionCodes", siteDto.getPermissionCodes());
        map.put("roleCodes", siteDto.getRoleCodes());
        map.put("siteCode", siteDto.getSiteCode());
        map.put("siteId", siteDto.getSiteId());
        map.put("stateCode", siteDto.getStateCode());
        map.put("systemInfoCode", siteDto.getSystemInfoCode());
        map.put("version", siteDto.getVersion());
        map.put("wfId", siteDto.getWfId());

        return map;
    }
}