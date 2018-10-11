package top.cardone.configuration.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryDao;
import top.cardone.context.util.MapUtils;
import top.cardone.context.util.StringUtils;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * 字典服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryServiceImpl extends PageServiceImpl<DictionaryDao> implements top.cardone.configuration.service.DictionaryService {
    @Override
    public List<Map<String, Object>> findListByDictionaryTypeCode(String dictionaryTypeCode) {
        Map<String, Object> findList = Maps.newHashMap();

        findList.put("dictionaryTypeCode", dictionaryTypeCode);

        return this.dao.findListBySqlFileName("selectByTypeCode", findList);
    }

    @Override
    public Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public String readOneValueByCode(String dictionaryTypeCode, String dictionaryCode, String defaultValue) {
        Map<String, Object> readOne = Maps.newHashMap();

        readOne.put("dictionaryTypeCode", dictionaryTypeCode);
        readOne.put("dictionaryCode", dictionaryCode);
        readOne.put("stateCode", MapUtils.getString(readOne, "stateCode", "1"));
        readOne.put("dataStateCode", MapUtils.getString(readOne, "dataStateCode", "1"));
        readOne.put("object_id", "value");

        return StringUtils.defaultIfBlank(this.dao.readOne(String.class, readOne), defaultValue);
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryTypeCodes(String dictionaryTypeCodes) {
        String[] dictionaryTypeCodeArray = StringUtils.split(dictionaryTypeCodes, ",");

        if (dictionaryTypeCodeArray == null) {
            return Lists.newArrayList();
        }

        for (String dictionaryTypeCode : dictionaryTypeCodeArray) {
            List<Map<String, Object>> mapList = this.findListByDictionaryTypeCode(dictionaryTypeCode);

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

        for (String dictionaryTypeCode : dictionaryTypeCodeArray) {
            readOne.put("dictionaryTypeCode", dictionaryTypeCode);

            Object obj = this.dao.readOne(String.class, readOne);

            boolean isSkip = Objects.isNull(obj) || (obj instanceof String && StringUtils.isEmpty((String) obj));

            if (isSkip) {
                continue;
            }

            return obj;
        }

        return null;
    }
}