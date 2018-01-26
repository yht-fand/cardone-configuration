package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.I18nInfoDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 国际化信息服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class I18nInfoServiceImpl extends PageServiceImpl<I18nInfoDao> implements top.cardone.configuration.service.I18nInfoService {
    @Override
    public Map<String, Object> findOneByI18nInfoId(Map<String, Object> findOne) {
        return this.dao.findOneByI18nInfoId(findOne);
    }

    @Override
    public Map<String, Integer> updateOther(String language) {
        return this.dao.updateOther(language);
    }
}