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

import java.util.Map;

/**
 * 变量服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.VariableService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface VariableService extends PageService {
    /**
     * 查询变量对象
     *
     * @param findOne 变量标识
     * @return 变量对象
     */
    Map<String, Object> findOneByVariableId(Map<String, Object> findOne);

    /**
     * 查询变量对象
     *
     * @param findOne 变量标识
     * @return 变量对象
     */
    @Cacheable(key = Caches.KEY_1)
    default Map<String, Object> findOneByVariableIdCache(Map<String, Object> findOne) {
        return this.findOneByVariableId(findOne);
    }
}