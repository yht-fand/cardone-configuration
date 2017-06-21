package top.cardone.configuration.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.task.TaskExecutor;
import org.springframework.data.domain.Page;
import org.springframework.scheduling.support.TaskUtils;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryDao;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * 字典服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryServiceImpl extends PageServiceImpl<DictionaryDao> implements top.cardone.configuration.service.DictionaryService {
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

    @Override
    public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
        return this.dao.pageByCode(page);
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode) {
        return this.dao.findlistByDictionaryTypeCode(dictionaryTypeCode);
    }

    @Override
    public Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne) {
        return this.dao.findOneByDictionaryId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        return this.dao.findListByKeyword(findList);
    }

    @Override
    public String readOneNameByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneByCode(dictionaryTypeCode, dictionaryCode, defaultValue, "name");
    }

    private String readOneByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue, String objectId) {
        Map<String, Object> readOne = Maps.newHashMap();

        readOne.put("dictionaryTypeCode", dictionaryTypeCode);
        readOne.put("dictionaryCode", dictionaryCode);
        readOne.put("stateCode", MapUtils.getString(readOne, "stateCode", "1"));
        readOne.put("dataStateCode", MapUtils.getString(readOne, "dataStateCode", "1"));
        readOne.put("object_id", objectId);

        return this.readOneByCode(readOne, defaultValue);
    }

    private String readOneByCode(Map<String, Object> readOne, String defaultValue) {
        String str = this.dao.readOne(String.class, readOne);

        if (StringUtils.isBlank(str) && StringUtils.isNotBlank(defaultValue)) {
            this.asynchronousInsert(Maps.newHashMap(readOne), defaultValue);
        }

        return StringUtils.defaultIfBlank(str, defaultValue);
    }

    private void asynchronousInsert(Map<String, Object> insert, String defaultValue) {
        insert.put(MapUtils.getString(insert, "object_id"), defaultValue);

        ApplicationContextHolder.getBean(TaskExecutor.class).execute(TaskUtils.decorateTaskWithErrorHandler(() -> {
            this.insertByNotExistsCache(insert);
        }, null, true));
    }

    @Override
    public String readOneValueByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneByCode(dictionaryTypeCode, dictionaryCode, defaultValue, "value");
    }

    @Override
    public String readOneRemarkByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneByCode(dictionaryTypeCode, dictionaryCode, defaultValue, "remark");
    }

    @Override
    public String readOneExplainByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        return this.readOneByCode(dictionaryTypeCode, dictionaryCode, defaultValue, "explain");
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryTypeCodes(String dictionaryTypeCodes) {
        String[] dictionaryTypeCodeArray = StringUtils.split(dictionaryTypeCodes, ",");

        if (dictionaryTypeCodeArray == null) {
            return Lists.newArrayList();
        }

        for (String dictionaryTypeCode : dictionaryTypeCodeArray) {
            List<Map<String, Object>> mapList = ApplicationContextHolder.getBean(DictionaryService.class).findListByDictionaryTypeCode(dictionaryTypeCode);

            if (!CollectionUtils.isEmpty(mapList)) {
                return mapList;
            }
        }

        return Lists.newArrayList();
    }

    @Override
    public Object readOneByDictionaryTypeCodes(Map<String, Object> readOne) {
        String[] dictionaryTypeCodeArray = StringUtils.split(MapUtils.getString(readOne, "dictionaryTypeCodes"), ",");

        if (dictionaryTypeCodeArray == null) {
            return null;
        }

        Set<String> insertDictionaryTypeCodes = Sets.newHashSet();

        for (String dictionaryTypeCode : dictionaryTypeCodeArray) {
            readOne.put("dictionaryTypeCode", dictionaryTypeCode);

            Object obj = this.readOneByCode(readOne, null);

            if (Objects.isNull(obj) || (obj instanceof String && StringUtils.isBlank((String) obj))) {
                insertDictionaryTypeCodes.add(dictionaryTypeCode);

                continue;
            }

            if ((obj instanceof String) && CollectionUtils.isNotEmpty(insertDictionaryTypeCodes)) {
                for (String insertDictionaryTypeCode : insertDictionaryTypeCodes) {
                    readOne.put("dictionaryTypeCode", insertDictionaryTypeCode);

                    this.asynchronousInsert(Maps.newHashMap(readOne), (String) obj);
                }
            }

            return obj;
        }

        return MapUtils.getString(readOne, "dictionaryCode");
    }
}