package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public class I18nInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.I18nInfoDao {

    @Override
    public Page<Map<String, Object>> pageByCode(Map<String, Object> page) {
        String countSqlFilePath = this.getSqlFilePath("page.count");
        String findListSqlFilePath = this.getSqlFilePath("page.find");
        return this.page(countSqlFilePath, findListSqlFilePath, page);
    }


    /**
     * 查询对象
     *
     * @param i18nInfoId 国际化信息标识
     * @return 国际化对象
     */
    @Override
    public Map<String, Object> findOneByI18nInfoId(String i18nInfoId) {
        Map<String, Object> findOne = Maps.newHashMap();
        findOne.put("i18nInfoId", i18nInfoId);
        String findOneSqlFilePath = this.getSqlFilePath("page.find");
        return this.findOne(findOneSqlFilePath, findOne);
    }
}