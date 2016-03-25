package top.cardone.configuration.func.dictionaryType.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryTypeDto;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * DictionaryType - 查询
 */
@Component("/web-api/v1/configuration/dictionaryType/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        DictionaryTypeDto dictionaryTypeDto = ApplicationContextHolder.getBean(DictionaryTypeService.class).findOne(DictionaryTypeDto.class, map);

        return this.toMap(dictionaryTypeDto);
    }

    private Map<String, Object> toMap(DictionaryTypeDto dictionaryTypeDto) {
        Map<String, Object> map = Maps.newHashMap();


        return map;
    }
}