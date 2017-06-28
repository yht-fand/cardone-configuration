package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 字典项服务
 *
 * @author yao hai tao
 */
public interface DictionaryItemService extends PageService {
	/**
     * @see top.cardone.configuration.service.DictionaryItemService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryItemService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int saveCache(Object save);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.configuration.service.DictionaryItemService#saveList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryItemService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询字典项对象
     *
     * @param findOne 字典项标识
     * @return 字典项对象
     */
    Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne);
	
    /**
     * 查询字典项下拉列表
     *
     * @param findList 关键字
     * @return 字典项下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}