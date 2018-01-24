package top.cardone.configuration.service.impl;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;
import top.cardone.configuration.dao.VariableDao;

import java.util.List;
import java.util.Map;

/**
 * 变量服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class VariableServiceImpl extends PageServiceImpl<VariableDao> implements top.cardone.configuration.service.VariableService {
    @Override
    public Map<String, Object> findOneByVariableId(Map<String, Object> findOne) {
        return this.dao.findOneByVariableId(findOne);
    }
}