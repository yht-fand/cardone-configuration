package top.cardone.configuration.func;

import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Created by cardo on 2017/9/11 0011.
 */
public class SaveDictionaryFunc implements Func1<Integer, Map<Integer, Object>> {
    @Override
    public Integer func(Map<Integer, Object> save) {
        return ApplicationContextHolder.getBean(DictionaryService.class).save(save);
    }
}
