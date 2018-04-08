package top.cardone.configuration.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
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
     * @see top.cardone.configuration.service.DictionaryService#page
     */
    @Cacheable(key = Caches.KEY_1)
    default Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#page
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#findList
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#findOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#readList
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#readOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#delete
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteCache(Object delete) {
        return this.delete(delete);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteAll
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteAllCache() {
        return this.deleteAll();
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteByIds
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#findList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#findOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#insert
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertCache(Object insert) {
        return this.insert(insert);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertListByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#readList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#readOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#save
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int saveCache(Object save) {
        return this.save(save);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#update
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int updateCache(Object update) {
        return this.update(update);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#updateList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#saveList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    default int[] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }

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
    default Map<String, Object> findOneByDictionaryIdCache(Map<String, Object> findOne) {
        return this.findOneByDictionaryId(findOne);
    }

    /**
     * 查询字典下拉列表
     *
     * @param findList 关键字
     * @return 字典下拉列表
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByKeywordCache(Map<String, Object> findList) {
        return this.findListByKeyword(findList);
    }

    List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode);

    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByDictionaryTypeCodeCache(String dictionaryTypeCode) {
        return this.findListByDictionaryTypeCode(dictionaryTypeCode);
    }

    String readOneValueByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable(key = Caches.KEY_3)
    default String readOneValueByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneValueByCode(dictionaryTypeCode, dictionaryCode, StringUtils.defaultIfBlank(defaultValue, dictionaryCode));
    }

    List<Map<String, Object>> findListByDictionaryTypeCodes(String dictionaryTypeCodes);

    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByDictionaryTypeCodesCache(String dictionaryTypeCodes) {
        return this.findListByDictionaryTypeCodes(dictionaryTypeCodes);
    }

    Object readOneByDictionaryTypeCodes(Map<String, Object> readOne);

    @Cacheable(key = Caches.KEY_1)
    default Object readOneByDictionaryTypeCodesCache(Map<String, Object> readOne) {
        return this.readOneByDictionaryTypeCodes(readOne);
    }
}