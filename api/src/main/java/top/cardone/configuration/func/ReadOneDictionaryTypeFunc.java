package top.cardone.configuration.func;

import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func2;
import top.cardone.mapper.BeanMapper;

import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class ReadOneDictionaryTypeFunc implements Func2<Object, Map<String, Object>, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map, Map<String, Object> config) {
        Map<String, Object> readOne = ApplicationContextHolder.getBean(BeanMapper.class).getObject(Map.class, map, config);

        boolean cache = MapUtils.getBooleanValue(config, "cache", true);

        if (cache) {
            return ApplicationContextHolder.getBean(DictionaryTypeService.class).readOneCache(String.class, readOne);
        }

        return ApplicationContextHolder.getBean(DictionaryTypeService.class).readOne(String.class, readOne);
    }
}
