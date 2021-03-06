package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.support.TaskUtils;
import top.cardone.cache.Cache;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func3;

import java.util.Map;

/**
 * @author cardo on 2017/5/4 0004.
 */
@Log4j2
public class ReadOneErrorInfoContentFunc implements Func3<String, String, String, String> {
    @Setter
    private String taskExecutorBeanName = "slowTaskExecutor";

    @Override
    public String func(String url, String errorInfoCode, String defaultContent) {
        String language = top.cardone.configuration.utils.DictionaryUtils.readOneValueByCodeCache("sys", "language", "zh_CN");

        Map<String, Object> findOneI18nInfo = Maps.newHashMap();

        findOneI18nInfo.put("typeCode", "errorInfo");
        findOneI18nInfo.put("language", language);
        findOneI18nInfo.put("i18nInfoCode", errorInfoCode);

        String key = "findOne(" +
                org.springframework.util.StringUtils.arrayToCommaDelimitedString(new Object[]{findOneI18nInfo}) +
                ")";

        Map<String, Object> errorInfo = ApplicationContextHolder.getBean(Cache.class).get(I18nInfoService.class.getName(), key,
                () -> ApplicationContextHolder.getBean(I18nInfoService.class)
                        .findOne(findOneI18nInfo));

        if (MapUtils.isEmpty(errorInfo)) {
            ApplicationContextHolder.getBean(TaskExecutor.class, this.taskExecutorBeanName).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
                Map<String, Object> insertI18nInfo = Maps.newHashMap();

                insertI18nInfo.put("typeCode", "errorInfo");
                insertI18nInfo.put("language", language);
                insertI18nInfo.put("i18nInfoCode", errorInfoCode);
                insertI18nInfo.put("content", defaultContent);

                ApplicationContextHolder.getBean(I18nInfoService.class).insertByNotExistsCache(insertI18nInfo);

                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    log.error(e);
                }
            }, null, true));
        }

        return StringUtils.defaultIfBlank(MapUtils.getString(errorInfo, "content"), defaultContent);
    }
}