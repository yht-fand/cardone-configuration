package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 系统信息
 *
 * @author yao hai tao
 */
public interface SystemInfoDao extends PageDao {
    /**
     * 查询系统信息对象
     *
     * @param findOne 系统信息标识
     * @return 系统信息对象
     */
    Map<String, Object> findOneBySystemInfoId(Map<String, Object> findOne);
	
    /**
     * 查询系统信息下拉列表
     *
     * @param findList 关键字
     * @return 系统信息下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}