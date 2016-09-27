package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 字典类别服务
 *
 * @author yao hai tao
 */
public interface DictionaryTypeService extends PageService {
	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#page
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_1)
	Page<Map<String, Object>> pageCache(Object page);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#page
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
	<P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#findList
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
	<P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#findOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
	<P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#readList
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
	<R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#readOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
	<R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#delete
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int deleteCache(Object delete);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#deleteAll
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int deleteAllCache();

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#deleteByIds
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int deleteByIdsCache(Object ids);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#deleteList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int[] deleteListCache(List<Object> deleteList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#findList
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_1)
	List<Map<String, Object>> findListCache(Object findList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#findOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_1)
	Map<String, Object> findOneCache(Object findOne);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#insert
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int insertCache(Object insert);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#insertByNotExists
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int insertByNotExistsCache(Object insert);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#insertList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int[] insertListCache(List<Object> insertList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#insertListByNotExists
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int[] insertListByNotExistsCache(List<Object> insertList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#readList
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_1)
	List<Object> readListCache(Object readList);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#readOne
	 */
	@Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_1)
	Object readOneCache(Object readOne);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#save
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	Integer saveCache(Object save);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#update
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int updateCache(Object update);

	/**
	 * @see top.cardone.configuration.service.DictionaryTypeService#updateList
	 */
	@CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
	int[] updateListCache(List<Object> updateList);

	/**
	 * 分页
	 *
	 * @param page 对象
	 * @return 分页对象
	 */
	Page<Map<String, Object>> pageByCode(Map<String, Object> page);

	/**
	 * 查询对象
	 *
	 * @param dictionaryTypeId 字典类别标识
	 * @return 字典类别对象
	 */
	Map<String, Object> findOneByDictionaryTypeId(String dictionaryTypeId);
}