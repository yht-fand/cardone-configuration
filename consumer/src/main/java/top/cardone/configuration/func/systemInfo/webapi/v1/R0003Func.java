package top.cardone.configuration.func.systemInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SystemInfoDto;
import top.cardone.configuration.service.SystemInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 系统信息 - 查询分页
 */
@Component("/web-api/v1/configuration/systemInfo/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<SystemInfoDto> systemInfoDtoPage = ApplicationContextHolder.getBean(SystemInfoService.class).page(SystemInfoDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(systemInfoDtoPage.getContent()), map, systemInfoDtoPage.getTotalElements()));
    }

    private List<Map<String, Object>> toMapList(List<SystemInfoDto> systemInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (SystemInfoDto systemInfoDto : systemInfoDtoList) {
            mapList.add(this.toMap(systemInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(SystemInfoDto systemInfoDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", systemInfoDto.getBeginDate());
        map.put("content", systemInfoDto.getContent());
        map.put("createdByCode", systemInfoDto.getCreatedByCode());
        map.put("createdDate", systemInfoDto.getCreatedDate());
        map.put("dataStateCode", systemInfoDto.getDataStateCode());
        map.put("departmentCode", systemInfoDto.getDepartmentCode());
        map.put("endDate", systemInfoDto.getEndDate());
        map.put("lastModifiedByCode", systemInfoDto.getLastModifiedByCode());
        map.put("lastModifiedDate", systemInfoDto.getLastModifiedDate());
        map.put("name", systemInfoDto.getName());
        map.put("orgCode", systemInfoDto.getOrgCode());
        map.put("permissionCodes", systemInfoDto.getPermissionCodes());
        map.put("remark", systemInfoDto.getRemark());
        map.put("roleCodes", systemInfoDto.getRoleCodes());
        map.put("stateCode", systemInfoDto.getStateCode());
        map.put("systemInfoCode", systemInfoDto.getSystemInfoCode());
        map.put("systemInfoId", systemInfoDto.getSystemInfoId());
        map.put("version", systemInfoDto.getVersion());
        map.put("wfId", systemInfoDto.getWfId());

        return map;
    }
}