package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryDto;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Dictionary - 查询
 */
@Component("/web-api/v1/configuration/dictionary/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        DictionaryDto dictionaryDto = ApplicationContextHolder.getBean(DictionaryService.class).findOne(DictionaryDto.class, map);

        return this.toMap(dictionaryDto);
    }

    private Map<String, Object> toMap(DictionaryDto dictionaryDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}