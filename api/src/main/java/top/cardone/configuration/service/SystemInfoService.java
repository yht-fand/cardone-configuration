package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 系统信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.SystemInfoService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface SystemInfoService extends PageService {
    /**
     * 查询系统信息对象
     *
     * @param findOne 系统信息标识
     * @return 系统信息对象
     */
    Map<String, Object> findOneBySystemInfoId(Map<String, Object> findOne);

    /**
     * 查询系统信息对象
     *
     * @param findOne 系统信息标识
     * @return 系统信息对象
     */
    @Cacheable
    default Map<String, Object> findOneBySystemInfoIdCache(Map<String, Object> findOne) {
        return this.findOneBySystemInfoId(findOne);
    }
}