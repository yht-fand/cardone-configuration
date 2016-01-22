package top.cardone.configuration.func.site.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SiteDto;
import top.cardone.configuration.service.SiteService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 站点 - 查询
 */
@Component("/web-api/v1/configuration/site/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        SiteDto siteDto = ApplicationContextHolder.getBean(SiteService.class).findOne(SiteDto.class, map);

        return this.toMap(siteDto);
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