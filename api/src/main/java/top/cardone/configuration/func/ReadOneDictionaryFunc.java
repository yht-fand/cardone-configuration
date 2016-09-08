package top.cardone.configuration.func;

import com.google.common.collect.Maps;
import lombok.Setter;
import org.apache.commons.collections.MapUtils;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
public class ReadOneDictionaryFunc implements Func1<String, Map<String, Object>> {
	@Setter
	private String dictionaryTypeCodeKeyName = "typeCode";

	@Setter
	private String dictionaryCodeKeyName = "code";
	@Setter
	private String objectIdKeyName = "objectId";

	@Override
	public String func(Map<String, Object> params) {
		Map<String, Object> readOneMap = Maps.newHashMap();

		readOneMap.put("dictionaryTypeCode", MapUtils.getString(params, dictionaryTypeCodeKeyName));
		readOneMap.put("dictionaryCode", MapUtils.getString(params, dictionaryCodeKeyName));
		readOneMap.put("object_id", MapUtils.getString(params, objectIdKeyName));

		return ApplicationContextHolder.getBean(DictionaryService.class).readOneCache(String.class, readOneMap);
	}
}
