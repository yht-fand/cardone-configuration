package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 站点服务
 *
 * @author yao hai tao
 */
public interface SiteService extends PageService {
	/**
     * @see top.cardone.configuration.service.SiteService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.configuration.service.SiteService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.configuration.service.SiteService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.configuration.service.SiteService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.configuration.service.SiteService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.configuration.service.SiteService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.configuration.service.SiteService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int deleteCache(Object delete);

	/**
     * @see top.cardone.configuration.service.SiteService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int deleteAllCache();

	/**
     * @see top.cardone.configuration.service.SiteService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.configuration.service.SiteService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.configuration.service.SiteService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.configuration.service.SiteService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.configuration.service.SiteService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int insertCache(Object insert);

	/**
     * @see top.cardone.configuration.service.SiteService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.configuration.service.SiteService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.SiteService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.SiteService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.configuration.service.SiteService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.SiteService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.configuration.service.SiteService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    Integer saveCache(Object save);

	/**
     * @see top.cardone.configuration.service.SiteService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int updateCache(Object update);

	/**
     * @see top.cardone.configuration.service.SiteService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.configuration.service.SiteService#saveList
     */
    @CacheEvict(value = "top.cardone.configuration.service.SiteService", allEntries = true)
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询站点对象
     *
     * @param findOne 站点标识
     * @return 站点对象
     */
    Map<String, Object> findOneBySiteId(Map<String, Object> findOne);
	
    /**
     * 查询站点下拉列表
     *
     * @param findList 关键字
     * @return 站点下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}