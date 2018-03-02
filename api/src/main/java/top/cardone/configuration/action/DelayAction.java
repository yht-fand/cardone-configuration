package top.cardone.configuration.action;

import com.google.common.collect.Maps;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.springframework.util.CollectionUtils;
import top.cardone.configuration.service.VariableService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.core.util.action.Action0;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * @author cardo on 2017/10/25 0025.
 */
@Log4j2
public class DelayAction implements Action0 {
    @Setter
    private Map<String, String> findOne;

    @Setter
    private String[] actionBeanIds;

    @Setter
    private Action0[] actionBeans;

    @Setter
    private Integer delay = 120;

    @Override

    public void action() {
        if (ArrayUtils.isEmpty(actionBeanIds) && ArrayUtils.isEmpty(actionBeans)) {
            return;
        }

        if (CollectionUtils.isEmpty(findOne)) {
            return;
        }

        Map<String, Object> variable = ApplicationContextHolder.getBean(VariableService.class).findOne(findOne);

        if (CollectionUtils.isEmpty(variable)) {
            return;
        }

        String value = MapUtils.getString(variable, "value_", "no");

        if (!BooleanUtils.toBoolean(value)) {
            return;
        }

        Date lastModifiedDate = (Date) MapUtils.getObject(variable, "last_modified_date");

        LocalDateTime delayTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(lastModifiedDate.getTime()), ZoneId.systemDefault()).plusSeconds(delay);

        if (delayTime.isAfter(LocalDateTime.now())) {
            return;
        }

        Map<String, Object> save = Maps.newHashMap();

        save.putAll(findOne);
        save.put("value", "no");

        ApplicationContextHolder.getBean(VariableService.class).save(save);

        if (ArrayUtils.isNotEmpty(actionBeanIds)) {
            for (String actionBeanId : actionBeanIds) {
                try {
                    ApplicationContextHolder.action(Action0.class, action0 -> action0.action(), actionBeanId);
                } catch (Exception e) {
                    log.error(e);
                }
            }
        }

        if (ArrayUtils.isNotEmpty(actionBeans)) {
            for (Action0 action : actionBeans) {
                try {
                    action.action();
                } catch (Exception e) {
                    log.error(e);
                }
            }
        }
    }
}
