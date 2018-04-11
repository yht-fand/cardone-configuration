package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryTypeDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.List;
import java.util.Map;

/**
 * 字典类别服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryTypeServiceImpl extends PageServiceImpl<DictionaryTypeDao> implements top.cardone.configuration.service.DictionaryTypeService {
    @Override
    public Map<String, Object> findOneByDictionaryTypeId(Map<String, Object> findOne) {
        return this.dao.findOneBySqlFileName("page.find", findOne);
    }

    @Override
    public List<Map<String, Object>> findListForTree(Map<String, Object> findList) {
        return this.dao.findListBySqlFileName("findListForTree", findList);
    }
}