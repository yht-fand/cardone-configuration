package top.cardone.configuration.func.i18nInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.CodeException;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 国际化信息 - 修改
 */
@Component("/web-api/v1/configuration/i18nInfo/u0001.json")
public class U0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        String i18nInfoId= MapUtils.getString(map,"i18nInfoId");
        String content = MapUtils.getString(map, "content");
        validate(i18nInfoId,content);

        Map<String, Object> update = Maps.newHashMap();
        update.put("i18nInfoId", i18nInfoId);
        update.put("content", content);
        return ApplicationContextHolder.getBean(I18nInfoService.class).updateCache(update);
    }

    /**
     * 验证
     * @param i18nInfoId
     * @param content
     */
    public void validate(String i18nInfoId,String content){
        if (StringUtils.isBlank(i18nInfoId)) {
            throw new CodeException("国际化标识不能为空值");
        }

        if (StringUtils.isBlank(content)) {
            throw new CodeException("名称不能为空值");
        }
    }
}