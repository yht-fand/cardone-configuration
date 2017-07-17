package top.cardone.configuration.service;

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
 * 导航服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.NavigationService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface NavigationService extends PageService {
    /**
     * @see top.cardone.configuration.service.NavigationService#page
     */
    @Cacheable(key = Caches.KEY_1)
    default Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#page
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#findList
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#findOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#readList
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#readOne
     */
    @Cacheable(key = Caches.KEY_2)
    default <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#delete
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int deleteCache(Object delete) {
        return this.delete(delete);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#deleteAll
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int deleteAllCache() {
        return this.deleteAll();
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#deleteByIds
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#deleteList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#findList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#findOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#insert
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int insertCache(Object insert) {
        return this.insert(insert);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#insertByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#insertList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#insertListByNotExists
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#readList
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#readOne
     */
    @Cacheable(key = Caches.KEY_1)
    default Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#save
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int saveCache(Object save) {
        return this.save(save);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#update
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int updateCache(Object update) {
        return this.update(update);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#updateList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    /**
     * @see top.cardone.configuration.service.NavigationService#saveList
     */
    @CacheEvict(allEntries = true)
    @Transactional
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    default int[][] saveListCache(List<Object> saveList) {
        return this.saveList(saveList);
    }

    /**
     * 查询导航对象
     *
     * @param findOne 导航标识
     * @return 导航对象
     */
    Map<String, Object> findOneByNavigationId(Map<String, Object> findOne);

    /**
     * 查询导航对象
     *
     * @param findOne 导航标识
     * @return 导航对象
     */
    default Map<String, Object> findOneByNavigationIdCache(Map<String, Object> findOne) {
        return this.findOneByNavigationId(findOne);
    }

    /**
     * 查询导航下拉列表
     *
     * @param findList 关键字
     * @return 导航下拉列表
     */
    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListByKeywordCache(Map<String, Object> findList) {
        return this.findListByKeyword(findList);
    }

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListForTreeCache(Map<String, Object> findList) {
        return this.findListForTree(findList);
    }

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(allEntries = true)
    @Events({@Event(applicationEvent = SimpleEvent.class)})
    int generateData(String flagObjectCode);
}