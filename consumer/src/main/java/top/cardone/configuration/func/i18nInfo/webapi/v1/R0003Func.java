package top.cardone.configuration.func.i18nInfo.webapi.vi;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.configuration.dto.I18nInfoDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 国际化信息 - 查询分页
 */
@Component("/web-api/v1/configuration/i18nInfo/r0003.json")
public class R0003Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<I18nInfoDto> i18nInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (I18nInfoDto i18nInfoDto : i18nInfoDtoList) {
            mapList.add(this.toMap(i18nInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(I18nInfoDto i18nInfoDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", i18nInfoDto.getBeginDate());
        map.put("content", i18nInfoDto.getContent());
        map.put("createdByCode", i18nInfoDto.getCreatedByCode());
        map.put("createdDate", i18nInfoDto.getCreatedDate());
        map.put("dataStateCode", i18nInfoDto.getDataStateCode());
        map.put("departmentCode", i18nInfoDto.getDepartmentCode());
        map.put("endDate", i18nInfoDto.getEndDate());
        map.put("i18nInfoId", i18nInfoDto.getI18nInfoId());
        map.put("lastModifiedByCode", i18nInfoDto.getLastModifiedByCode());
        map.put("lastModifiedDate", i18nInfoDto.getLastModifiedDate());
        map.put("orgCode", i18nInfoDto.getOrgCode());
        map.put("permissionCodes", i18nInfoDto.getPermissionCodes());
        map.put("roleCodes", i18nInfoDto.getRoleCodes());
        map.put("stateCode", i18nInfoDto.getStateCode());
        map.put("typeCode", i18nInfoDto.getTypeCode());
        map.put("version", i18nInfoDto.getVersion());
        map.put("wfId", i18nInfoDto.getWfId());

        return map;
    }
}
