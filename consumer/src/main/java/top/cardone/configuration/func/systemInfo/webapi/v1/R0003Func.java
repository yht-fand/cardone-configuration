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
 * SystemInfo - 查询分页
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


        return map;
    }
}