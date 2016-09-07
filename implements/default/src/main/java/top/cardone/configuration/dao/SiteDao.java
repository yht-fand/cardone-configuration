package top.cardone.configuration.dao;

import org.springframework.data.domain.Page;
import top.cardone.data.dao.PageDao;

import java.util.Map;

/**
 * 站点
 *
 * @author yao hai tao
 */
public interface SiteDao extends PageDao {

    /**
     * 分页
     *
     * @param page 对象
     * @return 分页对象
     */
    Page<Map<String, Object>> pageByCode(Map<String, Object> page);
}