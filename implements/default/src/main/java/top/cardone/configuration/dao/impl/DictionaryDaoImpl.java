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
    public List<Map<String, Object>> findlistByDictionaryTypeCode(String dictionaryTypeCode) {
        String findListSqlFilePath = this.getSqlFilePath("selectByTypeCode");

        Map<String, Object> findList = Maps.newHashMap();

        findList.put("dictionaryTypeCode", dictionaryTypeCode);

        return this.findList(findListSqlFilePath, findList);
    }
}