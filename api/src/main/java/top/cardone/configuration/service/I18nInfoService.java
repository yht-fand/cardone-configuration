package top.cardone.configuration.service;

import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.annotation.Event;
import top.cardone.context.annotation.Events;
import top.cardone.context.event.SimpleErrorEvent;
import top.cardone.context.event.SimpleEvent;
import top.cardone.data.service.PageService;

import java.util.Map;

/**
 * 国际化信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
@CacheConfig(cacheNames = {"top.cardone.configuration.service.I18nInfoService"})
@Events({@Event(applicationEvent = SimpleErrorEvent.class),
        @Event(applicationEvent = SimpleEvent.class)})
public interface I18nInfoService extends PageService {
    /**
     * 查询国际化信息对象
     *
     * @param findOne 国际化信息标识
     * @return 国际化信息对象
     */
    Map<String, Object> findOneByI18nInfoId(Map<String, Object> findOne);

    /**
     * 查询国际化信息对象
     *
     * @param findOne 国际化信息标识
     * @return 国际化信息对象
     */
    @Cacheable
    default Map<String, Object> findOneByI18nInfoIdCache(Map<String, Object> findOne) {
        return this.findOneByI18nInfoId(findOne);
    }

    @Transactional
    Map<String, Integer> updateOther(String language);

    @Transactional
    default Map<String, Integer> updateOther() {
        String language = top.cardone.configuration.utils.DictionaryUtils.readOneValueByCodeCache("sys", "language", "zh_CN");

        return this.updateOther(language);
    }
}