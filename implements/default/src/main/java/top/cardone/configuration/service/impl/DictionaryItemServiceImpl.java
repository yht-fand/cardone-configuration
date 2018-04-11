package top.cardone.configuration.service.impl;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryItemDao;
import top.cardone.context.util.StringUtils;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 字典项服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryItemServiceImpl extends PageServiceImpl<DictionaryItemDao> implements top.cardone.configuration.service.DictionaryItemService {
    @Override
    public Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryCode(String dictionaryTypeCode, String dictionaryCode) {
        Map<String, Object> findList = Maps.newHashMap();

        findList.put("dictionaryTypeCode", dictionaryTypeCode);
        findList.put("dictionaryCode", dictionaryCode);

        return this.dao.findListBySqlFileName("findListByDictionaryCode", findList);
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryCodes(String dictionaryTypeCode, String dictionaryCodes) {
        String[] dictionaryCodeArray = StringUtils.split(dictionaryCodes, ",");

        if (dictionaryCodeArray == null) {
            return Lists.newArrayList();
        }

        for (String dictionaryCode : dictionaryCodeArray) {
            List<Map<String, Object>> mapList = this.findListByDictionaryCode(dictionaryTypeCode, dictionaryCode);

            if (!CollectionUtils.isEmpty(mapList)) {
                return mapList;
            }
        }

        return Lists.newArrayList();
    }
}