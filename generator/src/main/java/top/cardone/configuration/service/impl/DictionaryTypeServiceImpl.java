package top.cardone.configuration.service.impl;

import top.cardone.configuration.dao.DictionaryTypeDao;
import org.springframework.transaction.annotation.Transactional;
import top.cardone.data.service.impl.PageServiceImpl;

/**
 * 字典类别服务
 *
 * @author yao hai tao
 */
@Transactional(readOnly = true)
public class DictionaryTypeServiceImpl extends PageServiceImpl<DictionaryTypeDao> implements top.cardone.configuration.service.DictionaryTypeService {
}