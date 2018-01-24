package top.cardone.configuration.dao.impl;

import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 变量
 *
 * @author yao hai tao
 */
public class VariableDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.VariableDao {
    @Override
    public Map<String, Object> findOneByVariableId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, findOne);
    }
}