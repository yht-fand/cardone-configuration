package top.cardone.configuration.func.i18nInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.I18nInfoDto;
import top.cardone.configuration.service.I18nInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 国际化信息 - 查询分页
 */
@Component("/web-api/v1/configuration/i18nInfo/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<I18nInfoDto> i18nInfoDtoPage = ApplicationContextHolder.getBean(I18nInfoService.class).page(I18nInfoDto.class, map);

        return ApplicationContextHolder.getBean(PageSupport.class).newMap(this.toMapList(i18nInfoDtoPage.getContent()), map, i18nInfoDtoPage.getTotalElements());
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
        map.put("i18nInfoCode", i18nInfoDto.getI18nInfoCode());
        map.put("i18nInfoId", i18nInfoDto.getI18nInfoId());
        map.put("lastModifiedByCode", i18nInfoDto.getLastModifiedByCode());
        map.put("lastModifiedDate", i18nInfoDto.getLastModifiedDate());
        map.put("orgCode", i18nInfoDto.getOrgCode());
        map.put("permissionCodes", i18nInfoDto.getPermissionCodes());
        map.put("roleCodes", i18nInfoDto.getRoleCodes());
        map.put("siteCode", i18nInfoDto.getSiteCode());
        map.put("stateCode", i18nInfoDto.getStateCode());
        map.put("systemInfoCode", i18nInfoDto.getSystemInfoCode());
        map.put("typeCode", i18nInfoDto.getTypeCode());
        map.put("version", i18nInfoDto.getVersion());
        map.put("wfId", i18nInfoDto.getWfId());

        return map;
    }
}