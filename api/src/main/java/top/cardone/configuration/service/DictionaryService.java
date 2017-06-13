package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Caches;
import top.cardone.data.service.PageService;

import java.util.List;
import java.util.Map;

/**
 * 字典服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public interface DictionaryService extends PageService {
    /**
     * @see top.cardone.configuration.service.DictionaryService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    default Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    /**
     * @see top.cardone.configuration.service.DictionaryService#page
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_2)
    <P> Page<P> pageCache(Class<P> mappedClass, Object page);

    /**
     * @see top.cardone.configuration.service.DictionaryService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_2)
    <P> List<P> findListCache(Class<P> mappedClass, Object findList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_2)
    <P> P findOneCache(Class<P> mappedClass, Object findOne);

    /**
     * @see top.cardone.configuration.service.DictionaryService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_2)
    <R> List<R> readListCache(Class<R> requiredType, Object readList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_2)
    <R> R readOneCache(Class<R> requiredType, Object readOne);

    /**
     * @see top.cardone.configuration.service.DictionaryService#delete
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int deleteCache(Object delete);

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteAll
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int deleteAllCache();

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteByIds
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int deleteByIdsCache(Object ids);

    /**
     * @see top.cardone.configuration.service.DictionaryService#deleteList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int[] deleteListCache(List<Object> deleteList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#findList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    List<Map<String, Object>> findListCache(Object findList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#findOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    Map<String, Object> findOneCache(Object findOne);

    /**
     * @see top.cardone.configuration.service.DictionaryService#insert
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int insertCache(Object insert);

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int insertByNotExistsCache(Object insert);

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int[] insertListCache(List<Object> insertList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#insertListByNotExists
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int[] insertListByNotExistsCache(List<Object> insertList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#readList
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    List<Object> readListCache(Object readList);

    /**
     * @see top.cardone.configuration.service.DictionaryService#readOne
     */
    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    Object readOneCache(Object readOne);

    /**
     * @see top.cardone.configuration.service.DictionaryService#save
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    Integer saveCache(Object save);

    /**
     * @see top.cardone.configuration.service.DictionaryService#update
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int updateCache(Object update);

    /**
     * @see top.cardone.configuration.service.DictionaryService#updateList
     */
    @CacheEvict(value = "top.cardone.configuration.service.DictionaryService", allEntries = true)
    int[] updateListCache(List<Object> updateList);

    /**
     * 分页
     *
     * @param page 对象
     * @return 分页对象
     */
    Page<Map<String, Object>> pageByCode(Map<String, Object> page);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    default List<Map<String, Object>> findListByDictionaryTypeCodeCache(String dictionaryTypeCode) {
        return this.findListByDictionaryTypeCode(dictionaryTypeCode);
    }

    List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode);

    /**
     * 查询对象
     *
     * @param findOne 字典标识
     * @return 字典对象
     */
    Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne);

    /**
     * 查询字典下拉列表
     *
     * @param findList 关键字
     * @return 字典下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    String readOneNameByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_3)
    default String readOneNameByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneNameByCode(dictionaryTypeCode, dictionaryCode, defaultValue);
    }

    String readOneValueByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_3)
    default String readOneValueByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneValueByCode(dictionaryTypeCode, dictionaryCode, defaultValue);
    }

    String readOneRemarkByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_3)
    default String readOneRemarkByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneRemarkByCode(dictionaryTypeCode, dictionaryCode, defaultValue);
    }

    String readOneExplainByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_3)
    String readOneExplainByCodeCache(String dictionaryTypeCode, String dictionaryCode, String defaultValue);

    List<Map<String, Object>> findListByDictionaryTypeCodes(String dictionaryTypeCodes);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    List<Map<String, Object>> findListByDictionaryTypeCodesCache(String dictionaryTypeCodes);

    @Cacheable(value = "top.cardone.configuration.service.DictionaryService", key = Caches.KEY_1)
    default Object readOneByDictionaryTypeCodesCache(Map<String, Object> readOne) {
        return this.readOneByDictionaryTypeCodes(readOne);
    }

    Object readOneByDictionaryTypeCodes(Map<String, Object> readOne);
}