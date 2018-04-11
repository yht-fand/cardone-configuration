package top.cardone.configuration.dao;

import top.cardone.data.dao.PageDao;

/**
 * 导航
 *
 * @author yao hai tao
 */
public interface NavigationDao extends PageDao {
    /**
     * 生成
     *
     * @param flagObjectCode 标识对象编号
     * @return
     */
    int generateData(String flagObjectCode);
}