package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
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
	
    /**
     * 查询导航下拉列表
     *
     * @param findList 关键字
     * @return 导航下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);

    /**
     * 查询树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);

    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}