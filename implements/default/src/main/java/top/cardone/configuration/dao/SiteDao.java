package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 站点
 *
 * @author yao hai tao
 */
public interface SiteDao extends PageDao {
    /**
     * 查询站点对象
     *
     * @param findOne 站点标识
     * @return 站点对象
     */
    Map<String, Object> findOneBySiteId(Map<String, Object> findOne);
}