package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public class I18nInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.I18nInfoDao {
    @Override
    public Map<String, Object> findOneByI18nInfoId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
        String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

        return this.findList(findListByKeywordSqlFilePath, findList);
    }
}