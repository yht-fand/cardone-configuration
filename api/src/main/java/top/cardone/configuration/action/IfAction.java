package top.cardone.configuration.action;

import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.core.util.action.Action0;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * Created by cardo on 2017/10/25 0025.
 */
public class IfAction implements Action0 {
    @Setter
    private Map<String, String> findOne;

    @Setter
    private String actionBeanId;

    @Setter
    private Integer delay = 120;

    @Override
    public void action() {
        if (StringUtils.isBlank(actionBeanId)) {
            return;
        }

        if (CollectionUtils.isEmpty(findOne)) {
            return;
        }

        Map<String, Object> dictionary = ApplicationContextHolder.getBean(DictionaryService.class).findOne(findOne);

        if (CollectionUtils.isEmpty(dictionary)) {
            return;
        }

        String value = MapUtils.getString(dictionary, "value_", "no");

        if (!BooleanUtils.toBoolean(value)) {
            return;
        }

        Date lastModifiedDate = (Date) MapUtils.getObject(dictionary, "last_modified_date");

        LocalDateTime delayTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifiedDate.getTime()), ZoneId.systemDefault()).plusSeconds(delay);

        if (delayTime.isBefore(LocalDateTime.now())) {
            return;
        }

        Map<String, Object> save = Maps.newHashMap();

        save.putAll(findOne);
        save.put("value", "no");

        ApplicationContextHolder.getBean(DictionaryService.class).save(save);

        ApplicationContextHolder.action(Action0.class, action0 -> action0.action(), actionBeanId);
    }
}
