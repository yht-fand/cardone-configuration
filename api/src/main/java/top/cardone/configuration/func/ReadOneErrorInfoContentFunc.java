package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.i18n.LocaleContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func3;

import java.util.Map;

/**
 * Created by cardo on 2017/5/4 0004.
 */
public class ReadOneErrorInfoContentFunc implements Func3<String, String, String, String> {
    @Override
    public String func(String url, String errorInfoCode, String defaultContent) {
        Map<String, Object> findOne = Maps.newHashMap();

        if (StringUtils.isBlank(url) && RequestContextHolder.getRequestAttributes() != null) {
            ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

            url = servletRequestAttributes.getRequest().getServletPath();
        }

        findOne.put("url", url);
        findOne.put("errorInfoCode", errorInfoCode);
        findOne.put("typeCode", LocaleContextHolder.getLocale().toString());

        Map<String, Object> errorInfo = ApplicationContextHolder.getBean(ErrorInfoService.class).findOneCache(findOne);

        String content = MapUtils.getString(errorInfo, "content");

        if (MapUtils.isNotEmpty(errorInfo)) {
            return StringUtils.defaultIfBlank(content, defaultContent);
        }

        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            Map<String, Object> insert = Maps.newHashMap();

            insert.put("url", findOne.get("url"));
            insert.put("typeCode", findOne.get("typeCode"));
            insert.put("errorInfoCode", findOne.get("errorInfoCode"));
            insert.put("content", defaultContent);

            ApplicationContextHolder.getBean(ErrorInfoService.class).saveCache(insert);
        }, null, false));

        return StringUtils.defaultIfBlank(content, defaultContent);
    }
}