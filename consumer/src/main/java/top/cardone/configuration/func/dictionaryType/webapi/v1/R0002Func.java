package top.cardone.configuration.func.dictionaryType.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryTypeDto;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * DictionaryType - 查询列表
 */
@Component("/web-api/v1/configuration/dictionaryType/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<DictionaryTypeDto> dictionaryTypeDtoList = ApplicationContextHolder.getBean(DictionaryTypeService.class).findList(DictionaryTypeDto.class, map);

        return this.toMapList(dictionaryTypeDtoList);
    }

    private List<Map<String, Object>> toMapList(List<DictionaryTypeDto> dictionaryTypeDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (DictionaryTypeDto dictionaryTypeDto : dictionaryTypeDtoList) {
            mapList.add(this.toMap(dictionaryTypeDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(DictionaryTypeDto dictionaryTypeDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}