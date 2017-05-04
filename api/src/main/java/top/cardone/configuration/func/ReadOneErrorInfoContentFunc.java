package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.i18n.LocaleContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func2;

import java.util.Map;

/**
 * Created by cardo on 2017/5/4 0004.
 */
public class ReadOneErrorInfoContentFunc implements Func2<String, String, String> {
    @Override
    public String func(String errorInfoCode, String defaultContent) {
        Map<String, Object> readOne = Maps.newHashMap();

        readOne.put("errorInfoCode", errorInfoCode);
        readOne.put("typeCode", LocaleContextHolder.getLocale().toString());
        readOne.put("object_id", "content");

        String content = ApplicationContextHolder.getBean(ErrorInfoService.class).readOneCache(String.class, readOne);

        if (StringUtils.isBlank(content)) {
            ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
                Map<String, Object> insert = Maps.newHashMap();

                insert.put("errorInfoCode", errorInfoCode);
                insert.put("content", defaultContent);
                insert.put("typeCode", LocaleContextHolder.getLocale().toString());

                ApplicationContextHolder.getBean(ErrorInfoService.class).insertByNotExistsCache(insert);
            }, null, false));
        }


        return StringUtils.defaultIfBlank(content, defaultContent);
    }
}
