package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * I18nInfo服务
 *
 * @author yao hai tao
 */
public interface I18nInfoService extends PageService {
	/**
     * @see top.cardone.configuration.service.I18nInfoService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.configuration.service.I18nInfoService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.I18nInfoService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.configuration.service.I18nInfoService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.I18nInfoService", allEntries = true)
    int[] updateListCache(List<Object> updateList);
}