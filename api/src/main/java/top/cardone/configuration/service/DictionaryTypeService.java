package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
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
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.DictionaryTypeService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface DictionaryTypeService extends PageService {
    /**
     * 查询字典类别对象
     *
     * @param findOne 字典类别标识
     * @return 字典类别对象
     */
    Map<String, Object> findOneByDictionaryTypeId(Map<String, Object> findOne);

    /**
     * 查询字典类别对象
     *
     * @param findOne 字典类别标识
     * @return 字典类别对象
     */
    @Cacheable
    default Map<String, Object> findOneByDictionaryTypeIdCache(Map<String, Object> findOne) {
        return this.findOneByDictionaryTypeId(findOne);
    }

    /**
     * 查询字典类别树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    @Cacheable
    default List<Map<String, Object>> findListForTreeCache(Map<String, Object> findList) {
        return this.findListForTree(findList);
    }
}