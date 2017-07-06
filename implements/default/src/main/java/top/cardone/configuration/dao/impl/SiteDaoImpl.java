package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 站点
 *
 * @author yao hai tao
 */
public class SiteDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.SiteDao {
    @Override
    public Map<String, Object> findOneBySiteId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }
}