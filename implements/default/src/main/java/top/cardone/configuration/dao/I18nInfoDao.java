package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public interface I18nInfoDao extends PageDao {

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
	 * @param i18nInfoId 国际化信息标识
	 * @return 国际化对象
	 */
	Map<String, Object> findOneByI18nInfoId(String i18nInfoId);
}