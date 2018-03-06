package top.cardone.data.func

import org.apache.commons.collections.MapUtils
import org.springframework.data.domain.Pageable

/**
 * @author yao hai tao
 * @date 2017/2/16
 */
class ReadNextForPageFunc extends ReadHasNextForPageFunc {
    @Override
    Object func(Map<String, Object> map, String key) {
        boolean hasNext = (boolean) super.func(map, key)

        Pageable pageable = (Pageable) MapUtils.getObject(map, "pageable")

        if (hasNext) {
            return pageable.getPageNumber() + 2
        }

        return pageable.getPageNumber() + 1
    }
}