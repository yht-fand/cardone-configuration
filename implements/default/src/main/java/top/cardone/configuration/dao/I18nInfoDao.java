package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public interface I18nInfoDao extends PageDao {
    Map<String, Integer> updateOther(String language);
}