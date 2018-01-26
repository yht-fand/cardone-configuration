package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import lombok.Setter;
import top.cardone.context.util.MapUtils;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 国际化信息
 *
 * @author yao hai tao
 */
public class I18nInfoDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.I18nInfoDao {
    @Override
    public Map<String, Object> findOneByI18nInfoId(Map<String, Object> findOne) {
        String findOneSqlFilePath = this.getSqlFilePath("page.find");

        return this.findOne(findOneSqlFilePath, findOne);
    }

    @Override
    public Map<String, Integer> updateOther(String language) {
        Map<String, Integer> updateOtherCountMap = Maps.newHashMap();

        Map<String, Object> updateOtherMap = this.configTable.row("updateOther");

        if (MapUtils.isEmpty(updateOtherMap)) {
            return updateOtherCountMap;
        }

        Map<String, Object> update = Maps.newHashMap();

        update.put("language", language);

        for (Map.Entry<String, Object> updateOtherMapEntry : updateOtherMap.entrySet()) {
            updateOtherCountMap.put(updateOtherMapEntry.getKey(), this.update(this.getSqlFilePath((String) updateOtherMapEntry.getValue()), update));
        }

        return updateOtherCountMap;
    }
}