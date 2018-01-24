package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 变量
 *
 * @author yao hai tao
 */
public interface VariableDao extends PageDao {
    /**
     * 查询变量对象
     *
     * @param findOne 变量标识
     * @return 变量对象
     */
    Map<String, Object> findOneByVariableId(Map<String, Object> findOne);
}