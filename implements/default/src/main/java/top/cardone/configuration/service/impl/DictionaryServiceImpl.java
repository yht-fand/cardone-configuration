package top.cardone.configuration.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.core.task.TaskExecutor;
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
    public List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode) {
        return this.dao.findlistByDictionaryTypeCode(dictionaryTypeCode);
    }

    @Override
    public Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne) {
        return this.dao.findOneByDictionaryId(findOne);
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

        return StringUtils.defaultIfBlank(str, defaultValue);
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
                }
            }

            return obj;
        }

        String defaultValue = MapUtils.getString(readOne, "defaultValue");

        for (String insertDictionaryTypeCode : insertDictionaryTypeCodes) {
            readOne.put("dictionaryTypeCode", insertDictionaryTypeCode);
        }

        return StringUtils.defaultIfBlank(defaultValue, MapUtils.getString(readOne, "dictionaryCode"));
    }
}