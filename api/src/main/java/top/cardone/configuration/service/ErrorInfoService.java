package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 错误信息服务
 *
 * @author yao hai tao
 */
public interface ErrorInfoService extends PageService {
	/**
     * @see top.cardone.configuration.service.ErrorInfoService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.ErrorInfoService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.configuration.service.ErrorInfoService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.ErrorInfoService", allEntries = true)
    int[] updateListCache(List<Object> updateList);
}