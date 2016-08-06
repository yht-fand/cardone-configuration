package top.cardone.configuration.func.errorInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;
import java.util.Map;

/**
 * 错误信息 - 修改
 */
@Component("/web-api/v1/configuration/errorInfo/u0001.json")
public class U0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {

      String errorInfoId= MapUtils.getString(map,"errorInfoId");
        if (StringUtils.isBlank(errorInfoId)) {
            throw new CodeException("错误信息标识不能为空值");
        }
        String content = MapUtils.getString(map, "content");
        if (StringUtils.isBlank(content)) {
            throw new CodeException("名称不能为空值");
        }

        Map<String, Object> update = Maps.newHashMap();
        update.put("errorInfoId", errorInfoId);
        update.put("content", content);
        return ApplicationContextHolder.getBean(ErrorInfoService.class).updateCache(update);

    }
}