package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.i18n.LocaleContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func3;

import java.util.Map;

/**
 * Created by cardo on 2017/5/4 0004.
 */
public class ReadOneErrorInfoContentFunc implements Func3<String, String, String, String> {
    @Override
    public String func(String url, String errorInfoCode, String defaultContent) {
        Map<String, Object> readOne = Maps.newHashMap();

        if (StringUtils.isBlank(url) && RequestContextHolder.getRequestAttributes() != null) {
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            url = servletRequestAttributes.getRequest().getServletPath();
        }

        readOne.put("url", StringUtils.EMPTY);
        readOne.put("errorInfoCode", errorInfoCode);
        readOne.put("typeCode", LocaleContextHolder.getLocale().toString());
        readOne.put("object_id", "content");

        String content = ApplicationContextHolder.getBean(ErrorInfoService.class).readOneCache(String.class, readOne);

        if (StringUtils.isBlank(content)) {
            readOne.put("url", StringUtils.defaultIfBlank(url, StringUtils.EMPTY));
            content = ApplicationContextHolder.getBean(ErrorInfoService.class).readOneCache(String.class, readOne);
        }

        if (StringUtils.isBlank(content)) {
            ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
                Map<String, Object> insert = Maps.newHashMap();

                insert.put("url", readOne.get("url"));
                insert.put("typeCode", readOne.get("typeCode"));
                insert.put("errorInfoCode", readOne.get("errorInfoCode"));
                insert.put("content", defaultContent);

                ApplicationContextHolder.getBean(ErrorInfoService.class).insertByNotExistsCache(insert);
            }, null, false));
        }

        return StringUtils.defaultIfBlank(content, defaultContent);
    }
}
