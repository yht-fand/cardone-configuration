package top.cardone.configuration.action;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.action.Action0;
import top.cardone.core.util.func.Func1;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Map;

/**
 * Created by cardo on 2018/3/9 0009.
 */
@Log4j2
public class DateIncrementAction implements Action0 {
    @Setter
    private Func1<Date, Date> incrementFunc;

    @Setter
    private String[] trueStrings = new String[]{"1"};

    @Setter
    private Map<String, Object> readOneDictionaryValueForSwitch;

    @Setter
    private Map<String, Object> readOneDictionaryValue;

    @Setter
    private Map<String, Object> saveDictionaryValue;

    @Setter
    private long minusHour = 0;

    @Override
    public void action() {
        if (incrementFunc == null) {
            return;
        }

        if (MapUtils.isEmpty(readOneDictionaryValue)) {
            return;
        }

        if (MapUtils.isEmpty(saveDictionaryValue)) {
            return;
        }

        if (MapUtils.isNotEmpty(readOneDictionaryValueForSwitch)) {
            String value = ApplicationContextHolder.getBean(DictionaryService.class).readOne(String.class, readOneDictionaryValueForSwitch);

            if (BooleanUtils.isFalse(BooleanUtils.toBoolean(value))) {
                if (!ArrayUtils.contains(trueStrings, value)) {
                    return;
                }
            }
        }

        String value = ApplicationContextHolder.getBean(DictionaryService.class).readOne(String.class, readOneDictionaryValue);

        Date date = null;

        if (StringUtils.isNotBlank(value)) {
            Long time = NumberUtils.toLong(value);

            if (time > 0L) {
                if (minusHour > 0) {
                    LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()).minusHours(minusHour);

                    date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
                } else {
                    date = new Date(time);
                }
            }
        }

        date = incrementFunc.func(date);

        if (date != null) {
            saveDictionaryValue.put("value", date.getTime() + StringUtils.EMPTY);

            ApplicationContextHolder.getBean(DictionaryService.class).save(saveDictionaryValue);
        }
    }
}