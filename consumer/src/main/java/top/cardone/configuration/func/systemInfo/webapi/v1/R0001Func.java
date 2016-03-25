package top.cardone.configuration.func.systemInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.SystemInfoDto;
import top.cardone.configuration.service.SystemInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * SystemInfo - 查询
 */
@Component("/web-api/v1/configuration/systemInfo/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        SystemInfoDto systemInfoDto = ApplicationContextHolder.getBean(SystemInfoService.class).findOne(SystemInfoDto.class, map);

        return this.toMap(systemInfoDto);
    }

    private Map<String, Object> toMap(SystemInfoDto systemInfoDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}