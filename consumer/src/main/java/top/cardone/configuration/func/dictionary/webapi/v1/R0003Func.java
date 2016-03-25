package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryDto;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * Dictionary - 查询分页
 */
@Component("/web-api/v1/configuration/dictionary/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<DictionaryDto> dictionaryDtoPage = ApplicationContextHolder.getBean(DictionaryService.class).page(DictionaryDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(dictionaryDtoPage.getContent()), map, dictionaryDtoPage.getTotalElements()));
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