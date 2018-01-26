package top.cardone.configuration.func;


import top.cardone.configuration.service.I18nInfoService;
import top.cardone.configuration.service.VariableService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;

/**
 * Created by cardo on 2017/9/11 0011.
 */
public class SaveListVariableFunc implements Func1<Object, List<Object>> {
    @Override
    public Object func(List<Object> saveList) {
        return ApplicationContextHolder.getBean(VariableService.class).saveList(saveList);
    }
}
