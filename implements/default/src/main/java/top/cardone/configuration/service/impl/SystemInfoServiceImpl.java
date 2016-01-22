package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.SystemInfoDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 系统信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class SystemInfoServiceImpl extends PageServiceImpl<SystemInfoDao> implements top.cardone.configuration.service.SystemInfoService {
}