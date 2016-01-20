package top.cardone.configuration.func.i18nInfo.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.I18nInfoDto;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 国际化信息 - 查询
 */
@Component("/web-api/v1/configuration/i18nInfo/r0001.json")
public class R0001Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        I18nInfoDto i18nInfoDto = ApplicationContextHolder.getBean(I18nInfoService.class).findOne(I18nInfoDto.class, map);

        return this.toMap(i18nInfoDto);
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
        map.put("i18nInfoCode", i18nInfoDto.getI18nInfoCode());
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