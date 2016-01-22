package top.cardone.configuration.func.systemInfo.webapi.v1;

import org.apache.commons.collections.MapUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.SystemInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 系统信息 - 批量删除
 */
@Component("/web-api/v1/configuration/systemInfo/d0002.json")
public class D0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<Object> deleteList = (List<Object>) MapUtils.getObject(map, "datas");

        return ApplicationContextHolder.getBean(SystemInfoService.class).deleteList(deleteList);
    }
}
