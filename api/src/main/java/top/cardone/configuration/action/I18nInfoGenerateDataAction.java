package top.cardone.configuration.action;

import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.action.Action0;

/**
 * Created by cardo on 2018/1/26 0026.
 */
public class I18nInfoGenerateDataAction implements Action0 {
    @Override
    public void action() {
        ApplicationContextHolder.getBean(I18nInfoService.class).updateOther();
    }
}