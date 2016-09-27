package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 错误信息
 *
 * @author yao hai tao
 */
public interface ErrorInfoDao extends PageDao {

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
	 * @param errorInfoId 错误信息标识
	 * @return 错误信息对象
	 */
	Map<String, Object> findOneByErrorInfoId(String errorInfoId);
}