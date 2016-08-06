package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典 - 修改
 */
@Component("/web-api/v1/configuration/dictionary/u0001.json")
public class U0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        String dictionaryId = MapUtils.getString(map, "dictionaryId");
        if (StringUtils.isBlank(dictionaryId)) {
            throw new CodeException("字典标识不能为空值");
        }
        String name = MapUtils.getString(map, "name");

        if (StringUtils.isBlank(name)) {
            throw new CodeException("名称不能为空值");
        }

        if(name.length() > 256){
            throw new CodeException("名称长度不能超过256");
        }
        //该接口只需要支持修改 name 字段
        //由于调用的是一个比较灵活的接口，需严格控制输入参数
        Map<String, Object> update = Maps.newHashMap();

        update.put("dictionaryId", dictionaryId);
        update.put("name", name);

        return ApplicationContextHolder.getBean(DictionaryService.class).updateCache(update);

    }
}