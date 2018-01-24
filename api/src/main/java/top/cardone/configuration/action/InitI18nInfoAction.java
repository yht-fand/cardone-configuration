package top.cardone.configuration.action;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import top.cardone.configuration.service.DictionaryService;
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
    private String contentKey = "name";

    @Setter
    private String typeCode = "data";

    @Override
    public void action(List<Map<String, Object>> maps) {
        List<Map<String, Object>> newMaps = Lists.newArrayList();

        Map<String, Object> putAllMap = Maps.newHashMap();

        putAllMap.put("language", ApplicationContextHolder.getBean(DictionaryService.class).readOneValueByCodeCache("sys", "language", "en"));
        putAllMap.put("typeCode", typeCode);

        for (Map<String, Object> map : maps) {
            Map<String, Object> newMap = Maps.newHashMap();

            String i18nInfoCode = StringUtils.EMPTY;

            for (String i18nInfoCodeKey : i18nInfoCodeKeys) {
                if (StringUtils.isNotBlank(i18nInfoCode)) {
                    i18nInfoCode += ",";
                }

                i18nInfoCode += MapUtils.getString(map, i18nInfoCodeKey);
            }

            newMap.put("i18nInfoCode", i18nInfoCode);
            newMap.put("content", MapUtils.getString(map, contentKey));

            newMap.putAll(putAllMap);

            newMaps.add(newMap);
        }

        ApplicationContextHolder.getBean(I18nInfoService.class).insertListByNotExistsCache(Lists.newArrayList(newMaps));
    }
}
