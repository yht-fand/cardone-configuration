package top.cardone.configuration.service.impl;

import org.springframework.transaction.annotation.Transactional;
import top.cardone.configuration.dao.DictionaryDao;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 字典服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryServiceImpl extends PageServiceImpl<DictionaryDao> implements top.cardone.configuration.service.DictionaryService {
}