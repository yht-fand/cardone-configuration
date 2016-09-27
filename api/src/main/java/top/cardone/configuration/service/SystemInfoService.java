package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 系统信息服务
 *
 * @author yao hai tao
 */
public interface SystemInfoService extends PageService {
	/**
	 * @see top.cardone.configuration.service.SystemInfoService#page
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_1)
	Page<Map<String, Object>> pageCache(Object page);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#page
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_2)
	<P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#findList
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_2)
	<P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#findOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_2)
	<P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#readList
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_2)
	<R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#readOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_2)
	<R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#delete
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int deleteCache(Object delete);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#deleteAll
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int deleteAllCache();

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#deleteByIds
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int deleteByIdsCache(Object ids);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#deleteList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int[] deleteListCache(List<Object> deleteList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#findList
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_1)
	List<Map<String, Object>> findListCache(Object findList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#findOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_1)
	Map<String, Object> findOneCache(Object findOne);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#insert
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int insertCache(Object insert);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#insertByNotExists
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int insertByNotExistsCache(Object insert);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#insertList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int[] insertListCache(List<Object> insertList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#insertListByNotExists
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int[] insertListByNotExistsCache(List<Object> insertList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#readList
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_1)
	List<Object> readListCache(Object readList);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#readOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.SystemInfoService", key = Caches.KEY_1)
	Object readOneCache(Object readOne);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#save
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	Integer saveCache(Object save);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#update
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int updateCache(Object update);

	/**
	 * @see top.cardone.configuration.service.SystemInfoService#updateList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.SystemInfoService", allEntries = true)
	int[] updateListCache(List<Object> updateList);

	/**
	 * 分页
	 *
	 * @param page 对象
	 * @return 分页对象
	 */
	Page<Map<String, Object>> pageByCode(Map<String, Object> page);
}