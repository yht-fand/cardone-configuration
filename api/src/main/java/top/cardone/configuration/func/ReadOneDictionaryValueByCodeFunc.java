package top.cardone.configuration.func;


import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func2;

/**
 * Created by cardo on 2017/9/11 0011.
 */
public class ReadOneDictionaryValueByCodeFunc implements Func2<String, String, String> {
    @Override

    public String func(String dictionTypeCode, String dictionCode) {
        return ApplicationContextHolder.getBean(DictionaryService.class).readOneValueByCode(dictionTypeCode, dictionCode, null);
    }
}
