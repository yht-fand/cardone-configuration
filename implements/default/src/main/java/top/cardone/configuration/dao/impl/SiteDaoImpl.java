package top.cardone.configuration.dao.impl;

import org.springframework.data.domain.Page;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 站点
 *
 * @author yao hai tao
 */
public class SiteDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.SiteDao {
	@Override
	public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
		String countSqlFilePath = this.getSqlFilePath("page.count");
		String findListSqlFilePath = this.getSqlFilePath("page.find");
		return this.page(countSqlFilePath, findListSqlFilePath, page);
	}
}