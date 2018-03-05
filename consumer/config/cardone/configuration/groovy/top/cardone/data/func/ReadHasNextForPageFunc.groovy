package top.cardone.data.func

import org.apache.commons.collections.MapUtils
import org.springframework.data.domain.Pageable
import top.cardone.core.util.func.Func2

/**
 * @author yao hai tao
 * @date 2017/2/16
 */
class ReadHasNextForPageFunc implements Func2<Object, Map<String, Object>, String> {
    @Override
    Object func(Map<String, Object> map, String key) {
        long total = MapUtils.getLongValue(map, "total", 0)

        if (total < 1) {
            return false
        }

        Pageable pageable = (Pageable) MapUtils.getObject(map, "pageable")

        if (total <= pageable.getPageSize()) {
            return false
        }

        double totalPages = pageable.getPageSize() == 0 ? 1 : (int) Math.ceil((double) total / (double) pageable.getPageSize())

        if (totalPages <= 1) {
            return false
        }

        return pageable.getPageNumber() + 1 < totalPages
    }
}