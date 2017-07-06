package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 系统信息
 *
 * @author yao hai tao
 */
public class SystemInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.SystemInfoDao {
    @Override
    public Map<String, Object> findOneBySystemInfoId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }
}