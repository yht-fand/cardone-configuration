package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.SystemInfoDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 系统信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class SystemInfoServiceImpl extends PageServiceImpl<SystemInfoDao> implements top.cardone.configuration.service.SystemInfoService {
    @Override
    public Map<String, Object> findOneBySystemInfoId(Map<String, Object> findOne) {
        return this.dao.findOneBySystemInfoId(findOne);
    }
}