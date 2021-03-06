package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.NavigationDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 导航服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class NavigationServiceImpl extends PageServiceImpl<NavigationDao> implements top.cardone.configuration.service.NavigationService {
    @Override
    public Map<String, Object> findOneByNavigationId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListBySqlFileName("findListForTree", findList);
    }

    @Override
    @Transactional
    public void generateData(String flagObjectCode) {
        this.dao.generateData(flagObjectCode);
    }
}