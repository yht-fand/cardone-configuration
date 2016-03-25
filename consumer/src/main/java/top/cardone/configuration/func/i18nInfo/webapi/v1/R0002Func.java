package top.cardone.configuration.func.i18nInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.I18nInfoDto;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * I18nInfo - 查询列表
 */
@Component("/web-api/v1/configuration/i18nInfo/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<I18nInfoDto> i18nInfoDtoList = ApplicationContextHolder.getBean(I18nInfoService.class).findList(I18nInfoDto.class, map);

        return this.toMapList(i18nInfoDtoList);
    }

    private List<Map<String, Object>> toMapList(List<I18nInfoDto> i18nInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (I18nInfoDto i18nInfoDto : i18nInfoDtoList) {
            mapList.add(this.toMap(i18nInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(I18nInfoDto i18nInfoDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}