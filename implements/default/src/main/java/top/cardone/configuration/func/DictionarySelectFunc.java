package top.cardone.configuration.func;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class DictionarySelectFunc implements Func1<List<Map<String, Object>>, Map<String, Object>> {
    @Setter
    private String dictionaryTypeCodeKeyName = "typeCode";

    @Override
    public List<Map<String, Object>> func(Map<String, Object> params) {
        String dictionaryTypeCode = MapUtils.getString(params, dictionaryTypeCodeKeyName);

        List<Map<String, Object>> dictionaryList = ApplicationContextHolder.getBean(DictionaryService.class).findListByTypeCodeCache(dictionaryTypeCode);

        List<Map<String, Object>> newDictionaryList = Lists.newArrayList();
        for (Map<String, Object> dictionary : dictionaryList) {
            Map<String, Object> returnMap = Maps.newHashMap();
            returnMap.put("text", MapUtils.getString(dictionary, "NAME"));
            returnMap.put("value", MapUtils.getString(dictionary, "DICTIONARY_CODE"));
            newDictionaryList.add(returnMap);
        }

        return newDictionaryList;
    }
}
