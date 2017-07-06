package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public interface I18nInfoDao extends PageDao {
    /**
     * 查询国际化信息对象
     *
     * @param findOne 国际化信息标识
     * @return 国际化信息对象
     */
    Map<String, Object> findOneByI18nInfoId(Map<String, Object> findOne);
}