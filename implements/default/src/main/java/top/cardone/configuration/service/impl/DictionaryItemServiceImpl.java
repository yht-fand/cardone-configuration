package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryItemDao;
import top.cardone.data.service.impl.PageServiceImpl;

import java.util.Map;

/**
 * 字典项服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryItemServiceImpl extends PageServiceImpl<DictionaryItemDao> implements top.cardone.configuration.service.DictionaryItemService {
    @Override
    public Map<String, Object> findOneByDictionaryItemId(Map<String, Object> findOne) {
        return this.dao.findOneByDictionaryItemId(findOne);
    }
}