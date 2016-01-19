package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.ErrorInfoDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * ErrorInfo服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class ErrorInfoServiceImpl extends PageServiceImpl<ErrorInfoDao> implements top.cardone.configuration.service.ErrorInfoService {
}