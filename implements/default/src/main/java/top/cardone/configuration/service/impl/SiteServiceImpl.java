package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.SiteDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 站点服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class SiteServiceImpl extends PageServiceImpl<SiteDao> implements top.cardone.configuration.service.SiteService {
}