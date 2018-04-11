package top.cardone.configuration.dao.impl;

import com.google.common.collect.Maps;
import top.cardone.data.jdbc.dao.impl.PageDaoImpl;

import java.util.Map;

/**
 * 导航
 *
 * @author yao hai tao
 */
public class NavigationDaoImpl extends PageDaoImpl implements top.cardone.configuration.dao.NavigationDao {
    @Override
    public int generateData(String flagObjectCode) {
//        String findListForDepartmentSqlFilePath = this.getSqlFilePath("findListForDepartment");
//
//        List<Map<String, Object>> forDepartmentList = this.findList(findListForDepartmentSqlFilePath);
//
        Map<String, Object> putAll = Maps.newHashMap();

        putAll.put("flagCode", "generate");
        putAll.put("flagObjectCode", flagObjectCode);

        int count = 0;
//
//        for (Map<String, Object> forDepartment : forDepartmentList) {
//            forDepartment.putAll(putAll);
//
//            count += this.insert(forDepartment);
//        }
//
        String deleteOtherByFlagObjectCodeSqlFilePath = this.getSqlFilePath("deleteOtherByFlagObjectCode");

        count += this.update(deleteOtherByFlagObjectCodeSqlFilePath, putAll);

        return count;
    }
}