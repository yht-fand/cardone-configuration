package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 错误信息
 *
 * @author yao hai tao
 */
public class ErrorInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.ErrorInfoDao {

    @Override
    public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
        String countSqlFilePath = this.getSqlFilePath("page.count");
        String findListSqlFilePath = this.getSqlFilePath("page.find");
        return this.page(countSqlFilePath, findListSqlFilePath, page);
    }

    @Override
    public Map<String, Object> findOneByErrorInfoId(String errorInfoId) {
        Map<String, Object> findOne = Maps.newHashMap();
        findOne.put("errorInfoId", errorInfoId);
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
        return this.findOne(findOneSqlFilePath, findOne);
    }
}