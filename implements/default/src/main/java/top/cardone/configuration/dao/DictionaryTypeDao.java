package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 字典类别
 *
 * @author yao hai tao
 */
public interface DictionaryTypeDao extends PageDao {
    /**
     * 查询字典类别对象
     *
     * @param findOne 字典类别标识
     * @return 字典类别对象
     */
    Map<String, Object> findOneByDictionaryTypeId(Map<String, Object> findOne);

    /**
     * 查询字典类别树
     *
     * @param findList 关键字
     * @return
     */
    List<Map<String, Object>> findListForTree(Map<String, Object> findList);
}