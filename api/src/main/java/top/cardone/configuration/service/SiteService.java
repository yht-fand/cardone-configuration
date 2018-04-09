package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
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
 * 站点服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.SiteService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface SiteService extends PageService {
    /**
     * 查询站点对象
     *
     * @param findOne 站点标识
     * @return 站点对象
     */
    Map<String, Object> findOneBySiteId(Map<String, Object> findOne);

    /**
     * 查询站点对象
     *
     * @param findOne 站点标识
     * @return 站点对象
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneBySiteIdCache(Map<String, Object> findOne) {
        return this.findOneBySiteId(findOne);
    }

    /**
     * 查询站点树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    @Cacheable(key = Caches.KEY_1)
    default List<Map<String, Object>> findListForTreeCache(Map<String, Object> findList) {
        return this.findListForTree(findList);
    }
}