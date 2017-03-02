package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

import java.util.List;
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
	
    /**
     * 查询国际化信息下拉列表
     *
     * @param findList 关键字
     * @return 国际化信息下拉列表
     */
    List<Map<String, Object>> findListByKeyword(Map<String, Object> findList);
}