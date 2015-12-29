package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.ErrorInfoDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.SimpleDefaultService;

/**
 * 错误信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class ErrorInfoServiceImpl extends SimpleDefaultService<ErrorInfoDao> implements top.cardone.configuration.service.ErrorInfoService {
}