package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
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
    @Events({@Event(applicationEvent = SimpleErrorEvent.class, configs = {"insertOperateLogAction"}),
            @Event(applicationEvent = SimpleEvent.class, configs = {"insertOperateLogAction"})})
    Page<Map<String, Object>> pageCache(Object page);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryTypeService", key = Caches.KEY_2)
    @Events({@Event(applicationEvent = SimpleErrorEvent.class, configs = {"insertOperateLogAction"}),
            @Event(applicationEvent = SimpleEvent.class, configs = {"insertOperateLogAction"})})
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
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int deleteCache(Object delete);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int deleteAllCache();

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
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
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int insertCache(Object insert);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
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
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int saveCache(Object save);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int updateCache(Object update);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int[] updateListCache(List<Object> updateList);

    /**
     * @see top.cardone.configuration.service.DictionaryTypeService#saveList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryTypeService", allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class, configs = "generateDictionaryTypeTreeFunc")})
    int[][] saveListCache(List<Object> saveList);

    /**
     * 查询字典类别对象
     *
     * @param findOne 字典类别标识
     * @return 字典类别对象
     */
    Map<String, Object> findOneByDictionaryTypeId(Map<String, Object> findOne);

    /**
     * 查询字典类别下拉列表
     *
     * @param findList 关键字
     * @return 字典类别下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 查询字典类别树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);
}