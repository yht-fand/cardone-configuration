package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
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
	
    /**
     * 查询站点下拉列表
     *
     * @param findList 关键字
     * @return 站点下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}