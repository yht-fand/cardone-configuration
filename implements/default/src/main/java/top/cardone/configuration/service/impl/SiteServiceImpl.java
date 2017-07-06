package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.SiteDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 站点服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class SiteServiceImpl extends PageServiceImpl<SiteDao> implements top.cardone.configuration.service.SiteService {
    @Override
    public Map<String, Object> findOneBySiteId(Map<String, Object> findOne) {
        return this.dao.findOneBySiteId(findOne);
    }
}