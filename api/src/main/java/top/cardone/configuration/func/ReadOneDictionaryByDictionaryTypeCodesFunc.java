package top.cardone.configuration.func;

import org.apache.commons.collections.MapUtils;
import top.cardone.cache.Cache;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func0;
import top.cardone.core.util.func.Func2;
import top.cardone.mapper.BeanMapper;

import java.util.Map;

/**
 * Created by yht on 16-3-28.
 */
public class ReadOneDictionaryByDictionaryTypeCodesFunc implements Func2<Object, Map<String, Object>, Map<String, Object>> {

    @Override
    public Object func(Map<String, Object> map, Map<String, Object> config) {
        Map<String, Object> readOne = ApplicationContextHolder.getBean(BeanMapper.class).getObject(Map.class, map, config);

        boolean cache = MapUtils.getBooleanValue(config, "cache", true);

        if (cache) {
            return ApplicationContextHolder.getBean(Cache.class).get(ReadOneDictionaryByDictionaryTypeCodesFunc.class.getName() + ".func", readOne, (Func0<Object>) () -> ReadOneDictionaryByDictionaryTypeCodesFunc.this.readOne(readOne));
        }

        return this.readOne(readOne);
    }

    public Object readOne(Map<String, Object> readOne) {
        return ApplicationContextHolder.getBean(DictionaryService.class).readOneByDictionaryTypeCodes(readOne);
    }
}