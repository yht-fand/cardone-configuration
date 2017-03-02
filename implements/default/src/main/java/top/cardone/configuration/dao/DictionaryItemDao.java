package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
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
	
    /**
     * 查询字典项下拉列表
     *
     * @param findList 关键字
     * @return 字典项下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}