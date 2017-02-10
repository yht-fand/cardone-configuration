package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 导航
 *
 * @author yao hai tao
 */
public class NavigationDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.NavigationDao {
    @Override
    public Map<String, Object> findOneByNavigationId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
		
        return this.findOne(findOneSqlFilePath, findOne);
    }
}