package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.NavigationDao;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.data.action.InitDataAction;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class NavigationServiceImpl extends PageServiceImpl<NavigationDao> implements top.cardone.configuration.service.NavigationService {
    @Override
    public Map<String, Object> findOneByNavigationId(Map<String, Object> findOne) {
        return this.dao.findOneByNavigationId(findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListForTree(findList);
    }

    @Override
    @Transactional
    public void generateData() {
        this.generateData(UUID.randomUUID().toString());
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }
}