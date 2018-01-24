package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func3;

import java.util.Map;
import java.util.regex.Pattern;

/**
 * Created by cardo on 2017/5/4 0004.
 */
public class ReadOneErrorInfoContentFunc implements Func3<String, String, String, String> {
    @Override

    public String func(String url, String errorInfoCode, String defaultContent) {
        String language = ApplicationContextHolder.getBean(DictionaryService.class).readOneValueByCodeCache("sys", "language", "en");

        Map<String, Object> findOneI18nInfo = Maps.newHashMap();

        findOneI18nInfo.put("typeCode", "errorInfo");
        findOneI18nInfo.put("language", language);
        findOneI18nInfo.put("i18nInfoCode", errorInfoCode);

        Map<String, Object> errorInfo = ApplicationContextHolder.getBean(I18nInfoService.class).findOneCache(findOneI18nInfo);

        if (MapUtils.isEmpty(errorInfo)) {
            ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
                Map<String, Object> insertI18nInfo = Maps.newHashMap();

                insertI18nInfo.put("typeCode", "errorInfo");
                insertI18nInfo.put("language", language);
                insertI18nInfo.put("i18nInfoCode", errorInfoCode);
                insertI18nInfo.put("content", defaultContent);

                ApplicationContextHolder.getBean(I18nInfoService.class).insertByNotExistsCache(insertI18nInfo);
            }, null, false));
        }

        return StringUtils.defaultIfBlank(MapUtils.getString(errorInfo, "content"), defaultContent);
    }
}