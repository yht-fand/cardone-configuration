package top.cardone.configuration.action;

import com.google.common.collect.Maps;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.data.convert.Jsr310Converters;
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
    private String incrementFuncBeanName;

    @Setter
    private String[] trueStrings = new String[]{"1"};

    @Setter
    private Map<String, Object> readOneDictionaryValueForSwitch;

    @Setter
    private Map<String, Object> readOneDictionaryValue;

    @Setter
    private String keySuffixFormat;

    @Setter
    private Map<String, Object> saveDictionaryValue;

    @Setter
    private long minusHour = 0;

    @Override
    public void action() {
        if (incrementFunc == null && StringUtils.isBlank(incrementFuncBeanName)) {
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

        Date date = null;

        String dictionaryCode = null;

        if (MapUtils.isNotEmpty(readOneDictionaryValue)) {
            Map<String, Object> readOne = Maps.newHashMap(readOneDictionaryValue);

            if (StringUtils.isNotBlank(keySuffixFormat)) {
                dictionaryCode = readOne.get("dictionaryCode") + ":" + DateFormatUtils.format(new Date(), keySuffixFormat);

                readOne.put("dictionaryCode", dictionaryCode);
            }

            String value = ApplicationContextHolder.getBean(DictionaryService.class).readOne(String.class, readOne);

            if (StringUtils.isNotBlank(value)) {
                Long time = NumberUtils.toLong(value);

                if (time > 0L) {
                    if (minusHour > 0) {
                        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(time), ZoneId.systemDefault()).minusHours(minusHour);

                        date = Jsr310Converters.LocalDateTimeToDateConverter.INSTANCE.convert(dateTime);
                    } else {
                        date = new Date(time);
                    }
                }
            }
        }

        if (incrementFunc != null) {
            date = incrementFunc.func(date);
        } else {
            date = (Date) ApplicationContextHolder.getBean(Func1.class, incrementFuncBeanName).func(date);
        }

        if (MapUtils.isNotEmpty(saveDictionaryValue) && (date != null)) {
            Map<String, Object> save = Maps.newHashMap(saveDictionaryValue);

            save.put("value", (date.getTime() + 1) + StringUtils.EMPTY);

            if (StringUtils.isNotBlank(dictionaryCode)) {
                save.put("dictionaryCode", dictionaryCode);
            }

            ApplicationContextHolder.getBean(DictionaryService.class).save(save);
        }
    }
}