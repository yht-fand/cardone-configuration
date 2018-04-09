package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 字典项服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.DictionaryItemService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface DictionaryItemService extends PageService {
    /**
     * 查询字典项对象
     *
     * @param findOne 字典项标识
     * @return 字典项对象
     */
    Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne);

    /**
     * 查询字典项对象
     *
     * @param findOne 字典项标识
     * @return 字典项对象
     */
    @Cacheable
    default Map<String, Object> findOneByDictionaryItemIdCache(Map<String, Object> findOne) {
        return this.findOneByDictionaryItemId(findOne);
    }

    List<Map<String, Object>> findListByDictionaryCode(String dictionaryTypeCode, String dictionaryCode);

    @Cacheable
    default List<Map<String, Object>> findListByDictionaryCodeCache(String dictionaryTypeCode, String dictionaryCode) {
        return this.findListByDictionaryCode(dictionaryTypeCode, dictionaryCode);
    }

    List<Map<String, Object>> findListByDictionaryCodes(String dictionaryTypeCode, String dictionaryCodes);

    @Cacheable
    default List<Map<String, Object>> findListByDictionaryCodesCache(String dictionaryTypeCode, String dictionaryCodes) {
        return this.findListByDictionaryCodes(dictionaryTypeCode, dictionaryCodes);
    }
}