package top.cardone.configuration.func;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class FindListDictionaryForSelectFunc implements Func1<List<Map<String, Object>>, Map<String, Object>> {
	@Setter
	private String dictionaryTypeCodeKeyName = "typeCode";

	@Setter
	private String stateCodeKeyName = "stateCode";

	@Override
	public List<Map<String, Object>> func(Map<String, Object> params) {
		Map<String, Object> findListMap = Maps.newHashMap();

		String stateCode = MapUtils.getString(params, stateCodeKeyName);

		if (StringUtils.isNotBlank(stateCode)) {
			findListMap.put("stateCode", stateCode);
		}

		findListMap.put("dictionaryTypeCode", MapUtils.getString(params, dictionaryTypeCodeKeyName));
		findListMap.put("order_by_order", "1");

		List<Map<String, Object>> dictionaryList = ApplicationContextHolder.getBean(DictionaryService.class).findListCache(findListMap);

		List<Map<String, Object>> newDictionaryList = Lists.newArrayList();

		for (Map<String, Object> dictionary : dictionaryList) {
			Map<String, Object> newDictionary = Maps.newHashMap();

			newDictionary.put("text", MapUtils.getString(dictionary, "NAME"));
			newDictionary.put("value", StringUtils.defaultIfBlank(MapUtils.getString(dictionary, "REMARK"), MapUtils.getString(dictionary, "DICTIONARY_CODE")));

			newDictionaryList.add(newDictionary);
		}

		return newDictionaryList;
	}
}
