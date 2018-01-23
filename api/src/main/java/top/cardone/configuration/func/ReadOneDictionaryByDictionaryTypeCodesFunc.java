package top.cardone.configuration.func;

import lombok.Synchronized;
import org.apache.commons.collections.MapUtils;
import top.cardone.cache.Cache;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func0;
import top.cardone.core.util.func.Func2;

import java.util.Map;

/**
 * Created by yht on 16-3-28.
 */
public class ReadOneDictionaryByDictionaryTypeCodesFunc implements Func2<Object, Map<String, Object>, Map<String, Object>> {
    @Override
    @Synchronized
    public Object func(Map<String, Object> map, Map<String, Object> config) {
        Map<String, Object> readOne = top.cardone.context.util.MapUtils.newHashMap(map, config);

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