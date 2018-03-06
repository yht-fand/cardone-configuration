package top.cardone.context.func

import org.apache.commons.collections.MapUtils
import org.apache.commons.lang3.BooleanUtils
import org.apache.commons.lang3.time.DateFormatUtils
import top.cardone.context.util.DateUtils
import top.cardone.core.util.func.Func3

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * @author yao hai tao
 * @date 2017/5/28
 */
class DateFormatFunc implements Func3<Object, Map<String, Object>, Map<String, Object>, String> {
    @Override
    Object func(Map<String, Object> map, Map<String, Object> params, String key) {
        key = MapUtils.getString(params, "key", key)

        Object value = MapUtils.getObject(map, key)

        Date date = null

        if (Objects.isNull(value)) {
            boolean isNotNull = MapUtils.getBooleanValue(params, "isNotNull", false)

            if (BooleanUtils.isFalse(isNotNull)) {
                return null
            }

            date = new Date()
        }

        if (date == null) {
            if (value instanceof Date) {
                date = (Date) value
            } else if (value instanceof String) {
                date = DateUtils.parseDate((String) value)
            } else {
                return value
            }
        }

        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault())

        int plusDays = MapUtils.getIntValue(params, "plusDays", 0)

        if (plusDays != 0) {
            dateTime = dateTime.plusDays(plusDays)
        }

        return DateFormatUtils.format(Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant()), MapUtils.getString(params, "format", DateFormatUtils.ISO_8601_EXTENDED_DATE_FORMAT.getPattern()))
    }
}