package top.cardone.configuration.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 字典服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.DictionaryService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface DictionaryService extends PageService {
    /**
     * 查询字典对象
     *
     * @param findOne 字典标识
     * @return 字典对象
     */
    Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne);

    /**
     * 查询字典对象
     *
     * @param findOne 字典标识
     * @return 字典对象
     */
    @Cacheable
    default Map<String, Object> findOneByDictionaryIdCache(Map<String, Object> findOne) {
        return this.findOneByDictionaryId(findOne);
    }

    List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode);

    @Cacheable
    default List<Map<String, Object>> findListByDictionaryTypeCodeCache(String dictionaryTypeCode) {
        return this.findListByDictionaryTypeCode(dictionaryTypeCode);
    }

    String readOneValueByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable
    default String readOneValueByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneValueByCode(dictionaryTypeCode, dictionaryCode, StringUtils.defaultIfBlank(defaultValue, dictionaryCode));
    }

    List<Map<String, Object>> findListByDictionaryTypeCodes(String dictionaryTypeCodes);

    @Cacheable
    default List<Map<String, Object>> findListByDictionaryTypeCodesCache(String dictionaryTypeCodes) {
        return this.findListByDictionaryTypeCodes(dictionaryTypeCodes);
    }

    Object readOneByDictionaryTypeCodes(Map<String, Object> readOne);

    @Cacheable
    default Object readOneByDictionaryTypeCodesCache(Map<String, Object> readOne) {
        return this.readOneByDictionaryTypeCodes(readOne);
    }
}