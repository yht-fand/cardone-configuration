package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.List;
import java.util.Map;

/**
 * 字典
 *
 * @author yao hai tao
 */
public class DictionaryDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.DictionaryDao {
	@Override
	public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
		String countSqlFilePath = this.getSqlFilePath("page.count");

		String findListSqlFilePath = this.getSqlFilePath("page.find");

		return this.page(countSqlFilePath, findListSqlFilePath, page);
	}

	@Override
	public List<Map<String, Object>> findlistByTypeCode(String dictionaryTypeCode) {
		String findListSqlFilePath = this.getSqlFilePath("selectByTypeCode");

		Map<String, Object> findList = Maps.newHashMap();

		findList.put("dictionaryTypeCode", dictionaryTypeCode);

		return this.findList(findListSqlFilePath, findList);
	}

	@Override
	public Map<String, Object> findOneByDictionaryId(Map<String, Object> findOne) {
		String findOneSqlFilePath = this.getSqlFilePath("page.find");

		return this.findOne(findOneSqlFilePath, findOne);
	}

	@Override
	public List<Map<String, Object>> findListByKeyword(Map<String, Object> findList) {
		String findListByKeywordSqlFilePath = this.getSqlFilePath("findListByKeyword");

		return this.findList(findListByKeywordSqlFilePath, findList);
	}
}