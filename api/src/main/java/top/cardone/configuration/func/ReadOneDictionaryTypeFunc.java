package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class ReadOneDictionaryTypeFunc implements Func1<String, Map<String, Object>> {
	@Setter
	private String dictionaryTypeCodeKeyName = "code";
	@Setter
	private String objectIdKeyName = "objectId";

	@Override
	public String func(Map<String, Object> params) {
		Map<String, Object> readOneMap = Maps.newHashMap();

		readOneMap.put("dictionaryTypeCode", MapUtils.getString(params, dictionaryTypeCodeKeyName));
		readOneMap.put("object_id", MapUtils.getString(params, objectIdKeyName));

		boolean cache = MapUtils.getBooleanValue(params, "cache", true);

		if (cache) {
			return ApplicationContextHolder.getBean(DictionaryTypeService.class).readOneCache(String.class, readOneMap);
		}

		return ApplicationContextHolder.getBean(DictionaryTypeService.class).readOne(String.class, readOneMap);
	}
}
