package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 错误信息
 *
 * @author yao hai tao
 */
public class ErrorInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.ErrorInfoDao {
    @Override
    public Map<String, Object> findOneByErrorInfoId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }
}