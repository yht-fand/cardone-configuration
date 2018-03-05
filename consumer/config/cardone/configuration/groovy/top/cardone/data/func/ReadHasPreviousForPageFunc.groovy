package top.cardone.data.func

import org.apache.commons.collections.MapUtils
import org.springframework.data.domain.Pageable
import top.cardone.core.util.func.Func2

/**
 * @author yao hai tao
 * @date 2017/2/16
 */
class ReadHasPreviousForPageFunc implements Func2<Object, Map<String, Object>, String> {
    @Override
    Object func(Map<String, Object> map, String key) {
        Pageable pageable = (Pageable) MapUtils.getObject(map, "pageable")

        return pageable.hasPrevious()
    }
}