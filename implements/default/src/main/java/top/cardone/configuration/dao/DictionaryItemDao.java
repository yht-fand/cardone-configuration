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
    List<Map<String, Object>> findListByDictionaryCode(String dictionaryTypeCode, String dictionaryCode);
}