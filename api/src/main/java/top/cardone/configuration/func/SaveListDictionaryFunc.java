package top.cardone.configuration.func;

import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;

/**
 * Created by cardo on 2017/9/11 0011.
 */
public class SaveListDictionaryFunc implements Func1<Object, List<Object>> {
    @Override
    public Object func(List<Object> saveList) {
        return ApplicationContextHolder.getBean(DictionaryService.class).saveList(saveList);
    }
}
