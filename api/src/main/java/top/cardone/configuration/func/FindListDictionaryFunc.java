package top.cardone.configuration.func;


import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

public class FindListDictionaryFunc implements Func1<List<Map<String, Object>>, Map<String, Object>> {
    @Override

    public List<Map<String, Object>> func(Map<String, Object> findList) {
        return ApplicationContextHolder.getBean(DictionaryService.class).findListCache(findList);
    }
}