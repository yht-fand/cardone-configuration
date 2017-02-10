package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 字典项
 *
 * @author yao hai tao
 */
public interface DictionaryItemDao extends PageDao {
    /**
     * 查询字典项对象
     *
     * @param findOne 字典项标识
     * @return 字典项对象
     */
    Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne);
}