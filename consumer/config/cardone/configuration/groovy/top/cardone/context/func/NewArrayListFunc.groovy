package top.cardone.context.func

import com.google.common.collect.Maps
import org.apache.commons.collections.MapUtils
import org.apache.commons.lang3.StringUtils
import top.cardone.core.util.func.Func3

/**
 * @author yao hai tao
 * @date 2017/2/15
 */
class NewArrayListFunc implements Func3<Object, Map<String, Object>, Map<String, Object>, String> {
    def valueKeys = ["content", "datas"]

    def configKeys = ["config", "input", "output"]

    @Override
    Object func(Map<String, Object> map, Map<String, Object> params, String key) {
        key = MapUtils.getString(params, "key", key)

        Object val = MapUtils.getObject(map, key)

        if (val == null) {
            for (String valueKey : valueKeys) {
                if (StringUtils.equals(valueKey, key)) {
                    continue
                }

                val = MapUtils.getObject(map, valueKey)

                if (val != null) {
                    break
                }
            }
        }

        if (val == null || !(val instanceof List)) {
            return val
        }

        Object config = null

        for (String configKey : configKeys) {
            config = MapUtils.getObject(params, configKey)

            if (config instanceof Map) {
                break
            }
        }

        if (!(config instanceof Map)) {
            config = params
        }

        if (config == null || !(config instanceof Map)) {
            config = Maps.newHashMap()
        }

        List list = (List) val

        def newList = []

        for (def obj : list) {
            newList.add(top.cardone.context.util.MapUtils.newHashMap(top.cardone.context.util.MapUtils.toMap(obj), config))
        }

        return newList
    }
}