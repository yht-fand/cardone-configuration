package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 导航
 *
 * @author yao hai tao
 */
public interface NavigationDao extends PageDao {
    /**
     * 查询导航对象
     *
     * @param findOne 导航标识
     * @return 导航对象
     */
    Map<String, Object> findOneByNavigationId(Map<String, Object> findOne);
}