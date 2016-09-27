package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 字典类别
 *
 * @author yao hai tao
 */
public interface DictionaryTypeDao extends PageDao {
	/**
	 * 分页
	 *
	 * @param page 对象
	 * @return 分页对象
	 */
	Page<Map<String, Object>> pageByCode(Map<String, Object> page);


	/**
	 * 查询对象
	 *
	 * @param dictionaryTypeId 字典类别标识
	 * @return 字典类别对象
	 */
	Map<String, Object> findOneByDictionaryTypeId(String dictionaryTypeId);
}