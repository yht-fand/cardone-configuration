package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.ErrorInfoDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 错误信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class ErrorInfoServiceImpl extends PageServiceImpl<ErrorInfoDao> implements top.cardone.configuration.service.ErrorInfoService {
    @Override
    public Map<String, Object> findOneByErrorInfoId(Map<String, Object> findOne) {
        return this.dao.findOneByErrorInfoId(findOne);
    }
}