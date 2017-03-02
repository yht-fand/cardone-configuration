package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 错误信息
 *
 * @author yao hai tao
 */
public interface ErrorInfoDao extends PageDao {
    /**
     * 查询错误信息对象
     *
     * @param findOne 错误信息标识
     * @return 错误信息对象
     */
    Map<String, Object> findOneByErrorInfoId(Map<String, Object> findOne);
	
    /**
     * 查询错误信息下拉列表
     *
     * @param findList 关键字
     * @return 错误信息下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}