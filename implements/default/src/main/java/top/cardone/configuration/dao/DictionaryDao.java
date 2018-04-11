package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.List;
import java.util.Map;

/**
 * 字典
 *
 * @author yao hai tao
 */
public interface DictionaryDao extends PageDao {
    List<Map<String, Object>> findlistByDictionaryTypeCode(String dictionaryTypeCode);
}