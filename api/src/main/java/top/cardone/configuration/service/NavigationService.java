package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import top.cardone.cache.Caches;
import top.cardone.context.annotation.Func;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
public interface NavigationService extends PageService {
	/**
     * @see top.cardone.configuration.service.NavigationService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_1)
    Page<Map<String, Object>> pageCache(Object page);

	/**
     * @see top.cardone.configuration.service.NavigationService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

	/**
     * @see top.cardone.configuration.service.NavigationService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

	/**
     * @see top.cardone.configuration.service.NavigationService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

	/**
     * @see top.cardone.configuration.service.NavigationService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

	/**
     * @see top.cardone.configuration.service.NavigationService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

	/**
     * @see top.cardone.configuration.service.NavigationService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int deleteCache(Object delete);

	/**
     * @see top.cardone.configuration.service.NavigationService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int deleteAllCache();

	/**
     * @see top.cardone.configuration.service.NavigationService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int deleteByIdsCache(Object ids);

	/**
     * @see top.cardone.configuration.service.NavigationService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int[] deleteListCache(List<Object> deleteList);

	/**
     * @see top.cardone.configuration.service.NavigationService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

	/**
     * @see top.cardone.configuration.service.NavigationService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

	/**
     * @see top.cardone.configuration.service.NavigationService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int insertCache(Object insert);

	/**
     * @see top.cardone.configuration.service.NavigationService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int insertByNotExistsCache(Object insert);

	/**
     * @see top.cardone.configuration.service.NavigationService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int[] insertListCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.NavigationService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

	/**
     * @see top.cardone.configuration.service.NavigationService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

	/**
     * @see top.cardone.configuration.service.NavigationService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.NavigationService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

	/**
     * @see top.cardone.configuration.service.NavigationService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int saveCache(Object save);

	/**
     * @see top.cardone.configuration.service.NavigationService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int updateCache(Object update);

	/**
     * @see top.cardone.configuration.service.NavigationService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int[] updateListCache(List<Object> updateList);

	/**
     * @see top.cardone.configuration.service.NavigationService#saveList
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int[][] saveListCache(List<Object> saveList);
	
    /**
     * 查询导航对象
     *
     * @param findOne 导航标识
     * @return 导航对象
     */
    Map<String, Object> findOneByNavigationId(Map<String, Object> findOne);
	
    /**
     * 查询导航下拉列表
     *
     * @param findList 关键字
     * @return 导航下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    /**
     * 生成
     *
     * @return
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int generateData();

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    @CacheEvict(value = "top.cardone.configuration.service.NavigationService", allEntries = true)
    @Func(beanId = "funcAnnotationFunc", value = "{\"afterBeanIds\": \"generateNavigationTreeFunc\"}")
    int generateData(String flagObjectCode);
}