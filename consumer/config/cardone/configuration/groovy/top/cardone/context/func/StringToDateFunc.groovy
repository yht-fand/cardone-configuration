package top.cardone.context.func

import org.apache.commons.collections.MapUtils
import org.apache.commons.lang3.BooleanUtils
import top.cardone.context.util.DateUtils
import top.cardone.core.util.func.Func1
import top.cardone.core.util.func.Func3

import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneId

/**
 * @author yao hai tao
 * @date 2017/5/28
 */
class StringToDateFunc implements Func1<Object, Object>, Func3<Object, Map<String, Object>, Map<String, Object>, String> {
    @Override
    Object func(Map<String, Object> map, Map<String, Object> params, String key) {
        Date date = DateUtils.parseDate(MapUtils.getString(map, MapUtils.getString(params, "key", key)))

        if (Objects.isNull(date)) {
            boolean isNotNull = MapUtils.getBooleanValue(params, "isNotNull", false)

            if (BooleanUtils.isFalse(isNotNull)) {
                return null
            }

            LocalDateTime dateTime = LocalDateTime.now()

            dateTime = LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(), dateTime.getDayOfMonth(), 0, 0, 0)

            date = Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant())
        }

        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault())

        int plusDays = MapUtils.getIntValue(params, "plusDays", 0)

        if (plusDays != 0) {
            dateTime = dateTime.plusDays(plusDays)
        }

        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant())
    }

    @Override
    Object func(Object obj) {
        if (obj == null) {
            return obj
        }

        if (obj instanceof String) {
            return DateUtils.parseDate((String) obj)
        }

        return obj
    }
}