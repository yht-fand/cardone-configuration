package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 字典类别
 *
 * @author yao hai tao
 */
public class DictionaryTypeDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.DictionaryTypeDao {
    @Override
    public Map<String, Object> findOneByDictionaryTypeId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }
}