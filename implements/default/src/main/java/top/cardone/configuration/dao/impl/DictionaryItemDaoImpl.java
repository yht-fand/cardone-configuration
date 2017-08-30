package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 字典项
 *
 * @author yao hai tao
 */
public class DictionaryItemDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.DictionaryItemDao {
    @Override
    public Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByDictionaryCode(String dictionaryTypeCode, String dictionaryCode) {
        String findListByDictionaryCodeSqlFilePath = this.getSqlFilePath("findListByDictionaryCode");

        Map<String, Object> findList = Maps.newHashMap();

        findList.put("dictionaryTypeCode", dictionaryTypeCode);
        findList.put("dictionaryCode", dictionaryCode);

        return this.findList(findListByDictionaryCodeSqlFilePath, findList);
    }
}