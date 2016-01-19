package top.cardone.configuration.func.errorInfo.webapi.vi;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.ErrorInfoDto;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * ErrorInfo - 查询
 */
@Component("/web-api/v1/configuration/errorInfo/r0001.json")
public class R0001Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<ErrorInfoDto> errorInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (ErrorInfoDto errorInfoDto : errorInfoDtoList) {
            mapList.add(this.toMap(errorInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(ErrorInfoDto errorInfoDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}
