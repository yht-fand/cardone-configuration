package top.cardone.configuration.service.impl;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.cache.Cache;
import top.cardone.configuration.dao.I18nInfoDao;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.StringUtils;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 国际化信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class I18nInfoServiceImpl extends PageServiceImpl<I18nInfoDao> implements top.cardone.configuration.service.I18nInfoService {
    @Override
    public Page<Map<String, Object>> pageCache(Object page) {
        return this.page(page);
    }

    @Override
    public <P> Page<P> pageCache(Class<P> mappedClass, Object page) {
        return this.page(mappedClass, page);
    }

    @Override
    public <P> List<P> findListCache(Class<P> mappedClass, Object findList) {
        return this.findList(mappedClass, findList);
    }

    @Override
    public <P> P findOneCache(Class<P> mappedClass, Object findOne) {
        return this.findOne(mappedClass, findOne);
    }

    @Override
    public <R> List<R> readListCache(Class<R> requiredType, Object readList) {
        return this.readList(requiredType, readList);
    }

    @Override
    public <R> R readOneCache(Class<R> requiredType, Object readOne) {
        return this.readOne(requiredType, readOne);
    }

    @Override
    @Transactional
    public int deleteCache(Object delete) {
        return this.delete(delete);
    }

    @Override
    @Transactional
    public int deleteAllCache() {
        return this.deleteAll();
    }

    @Override
    @Transactional
    public int deleteByIdsCache(Object ids) {
        return this.deleteByIds(ids);
    }

    @Override
    @Transactional
    public int[] deleteListCache(List<Object> deleteList) {
        return this.deleteList(deleteList);
    }

    @Override
    public List<Map<String, Object>> findListCache(Object findList) {
        return this.findList(findList);
    }

    @Override
    public Map<String, Object> findOneCache(Object findOne) {
        return this.findOne(findOne);
    }

    @Override
    @Transactional
    public int insertCache(Object insert) {
        return this.insert(insert);
    }

    @Override
    @Transactional
    public int insertByNotExistsCache(Object insert) {
        return this.insertByNotExists(insert);
    }

    @Override
    @Transactional
    public int[] insertListCache(List<Object> insertList) {
        return this.insertList(insertList);
    }

    @Override
    @Transactional
    public int[] insertListByNotExistsCache(List<Object> insertList) {
        return this.insertListByNotExists(insertList);
    }

    @Override
    public List<Object> readListCache(Object readList) {
        return this.readList(readList);
    }

    @Override
    public Object readOneCache(Object readOne) {
        return this.readOne(readOne);
    }

    @Override
    @Transactional
    public Integer saveCache(Object save) {
        return this.save(save);
    }

    @Override
    @Transactional
    public int updateCache(Object update) {
        return this.update(update);
    }

    @Override
    @Transactional
    public int[] updateListCache(List<Object> updateList) {
        return this.updateList(updateList);
    }

    public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
        return this.dao.pageByCode(page);
    }

    /**
     * 查询对象
     *
     * @param i18nInfoId 国际化信息标识
     * @return 国际化对象
     */
    public Map<String, Object> findOneByI18nInfoId(String i18nInfoId) {
        return this.dao.findOneByI18nInfoId(i18nInfoId);
    }

    @Override
    public String readOneContentByCodeCache(String typeCode, String i18nInfoCode, String defaultValue) {
        return this.readOneContentByCode(typeCode, i18nInfoCode, defaultValue);
    }

    @Override
    public String readOneContentByCode(String typeCode, String i18nInfoCode, String defaultValue) {
        Map<String, Object> inputs = Maps.newHashMap();

        inputs.put("typeCode", typeCode);
        inputs.put("i18nInfoCode", i18nInfoCode);
        inputs.put("object_id", "content");

        String str = this.dao.readOne(String.class, inputs);

        inputs.put("defaultValue", defaultValue);

        if (StringUtils.isBlank(str)) {
            //添加到缓存队列中，交由定时任务去生成国际化
            Set<Map<String, Object>> insertI18nInfoSet = ApplicationContextHolder.getBean(Cache.class).get("init-data", "insertI18nInfoSet", () -> {
                return Sets.newHashSet();
            });

            insertI18nInfoSet.add(inputs);

            ApplicationContextHolder.getBean(Cache.class).put("init-data", "insertI18nInfoSet", insertI18nInfoSet);
        }

        return StringUtils.defaultIfBlank(str, defaultValue);
    }
}