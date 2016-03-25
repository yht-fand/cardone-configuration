package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryDto;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Dictionary - 查询列表
 */
@Component("/web-api/v1/configuration/dictionary/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<DictionaryDto> dictionaryDtoList = ApplicationContextHolder.getBean(DictionaryService.class).findList(DictionaryDto.class, map);

        return this.toMapList(dictionaryDtoList);
    }

    private List<Map<String, Object>> toMapList(List<DictionaryDto> dictionaryDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (DictionaryDto dictionaryDto : dictionaryDtoList) {
            mapList.add(this.toMap(dictionaryDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(DictionaryDto dictionaryDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}