package top.cardone.context.func

import org.apache.commons.collections.MapUtils
import org.apache.commons.lang3.StringUtils
import top.cardone.core.util.func.Func2

/**
 * @author yao hai tao
 * @date 2017/4/22
 */
class ReadOneForJoinStringFunc implements Func2<Object, Map<String, Object>, Map<String, Object>> {
    @Override
    Object func(Map<String, Object> map, Map<String, Object> config) {
        Map<String, Object> readOne = top.cardone.context.util.MapUtils.newHashMap(map, config)

        String str = null

        String tmp

        String separator = MapUtils.getString(readOne, "separator", ",")

        for (int i = 1; i < 9; i++) {
            String key = "str" + i

            if (!readOne.containsKey(key)) {
                break
            }

            tmp = MapUtils.getString(readOne, key)

            if (StringUtils.isBlank(tmp)) {
                continue
            }

            if (StringUtils.isBlank(str)) {
                str = tmp
            } else {
                str += separator + tmp
            }
        }

        return str
    }
}