package top.cardone.configuration.action;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.time.DateFormatUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.DateUtils;
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
    private Map<String, Object> readOneDictionaryValue;

    @Setter
    private Map<String, Object> saveDictionaryValue;

    @Setter
    private long minusDays = 1;

    private Date date;

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

        String value;

        if (date == null) {
            value = ApplicationContextHolder.getBean(DictionaryService.class).findOne(String.class, readOneDictionaryValue);

            date = DateUtils.parseDate(value);
        } else {
            LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault()).minusDays(minusDays);

            date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
        }

        date = incrementFunc.func(date);

        if (date != null) {
            value = DateFormatUtils.format(date, StringUtils.remove(DateFormatUtils.ISO_8601_EXTENDED_DATETIME_FORMAT.getPattern(), "'T'"));

            saveDictionaryValue.put("value", value);

            ApplicationContextHolder.getBean(DictionaryService.class).save(saveDictionaryValue);
        }
    }
}
