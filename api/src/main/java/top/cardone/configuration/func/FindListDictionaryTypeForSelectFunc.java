package top.cardone.configuration.func;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class FindListDictionaryTypeForSelectFunc implements Func1<List<Map<String, Object>>, Map<String, Object>> {
	@Setter
	private String parentCodeKeyName = "parentCode";

	@Setter
	private String stateCodeKeyName = "stateCode";

	@Override
	public List<Map<String, Object>> func(Map<String, Object> params) {
		Map<String, Object> findListMap = Maps.newHashMap();

		String stateCode = MapUtils.getString(params, stateCodeKeyName);

		if (StringUtils.isNotBlank(stateCode)) {
			findListMap.put("stateCode", stateCode);
		}

		findListMap.put("parentCode", MapUtils.getString(params, parentCodeKeyName));
		findListMap.put("order_by_order", "1");

		List<Map<String, Object>> dictionaryTypeList = ApplicationContextHolder.getBean(DictionaryTypeService.class).findListCache(findListMap);

		List<Map<String, Object>> newDictionaryTypeList = Lists.newArrayList();

		for (Map<String, Object> dictionaryType : dictionaryTypeList) {
			Map<String, Object> newDictionaryType = Maps.newHashMap();

			newDictionaryType.put("text", MapUtils.getString(dictionaryType, "NAME"));
			newDictionaryType.put("value", StringUtils.defaultIfBlank(MapUtils.getString(dictionaryType, "VALUE_"), MapUtils.getString(dictionaryType, "DICTIONARY_TYPE_CODE")));

			newDictionaryTypeList.add(newDictionaryType);
		}

		return newDictionaryTypeList;
	}
}
