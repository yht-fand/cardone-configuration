package top.cardone.configuration.func.errorInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.ErrorInfoDto;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * ErrorInfo - 查询
 */
@Component("/web-api/v1/configuration/errorInfo/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        ErrorInfoDto errorInfoDto = ApplicationContextHolder.getBean(ErrorInfoService.class).findOne(ErrorInfoDto.class, map);

        return this.toMap(errorInfoDto);
    }

    private Map<String, Object> toMap(ErrorInfoDto errorInfoDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}