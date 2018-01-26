package top.cardone.configuration.action;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.core.util.action.Action1;

import java.util.List;
import java.util.Map;

/**
 * Created by cardo on 2018/1/24 0024.
 */
public class InitI18nInfoAction implements Action1<List<Map<String, Object>>> {
    @Setter
    private String[] i18nInfoCodeKeys;

    @Setter
    private String[] languages = new String[]{"zh_CN", "en"};

    @Setter
    private String contentKey = "name";

    @Setter
    private String typeCode = "data";

    @Override
    public void action(List<Map<String, Object>> maps) {
        List<Map<String, Object>> newMaps = Lists.newArrayList();

        for (Map<String, Object> map : maps) {
            String i18nInfoCode = StringUtils.EMPTY;

            for (String i18nInfoCodeKey : i18nInfoCodeKeys) {
                if (StringUtils.isNotBlank(i18nInfoCode)) {
                    i18nInfoCode += ",";
                }

                i18nInfoCode += MapUtils.getString(map, i18nInfoCodeKey);
            }

            for (String language : languages) {
                Map<String, Object> newMap = Maps.newHashMap();

                newMap.put("i18nInfoCode", i18nInfoCode);
                newMap.put("language", language);
                newMap.put("content", MapUtils.getString(map, contentKey));
                newMap.put("typeCode", typeCode);

                newMaps.add(newMap);
            }
        }

        ApplicationContextHolder.getBean(I18nInfoService.class).insertListByNotExistsCache(Lists.newArrayList(newMaps));
    }
}
