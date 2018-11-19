package top.cardone.configuration.navigation.func

import top.cardone.core.util.func.Func2
import top.cardone.data.dao.PageDao

class FindListFunc implements Func2<List<Map<String, Object>>, PageDao, Map<String, Object>> {
    @Override
    List<Map<String, Object>> func(PageDao pageDao, Map<String, Object> readOne) {
        pageDao.findListBySqlFileName("findList", readOne)
    }
}