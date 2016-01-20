package top.cardone.configuration.func.errorInfo.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.ErrorInfoDto;
import top.cardone.configuration.service.ErrorInfoService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 错误信息 - 查询分页
 */
@Component("/web-api/v1/configuration/errorInfo/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<ErrorInfoDto> errorInfoDtoPage = ApplicationContextHolder.getBean(ErrorInfoService.class).page(ErrorInfoDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(errorInfoDtoPage.getContent()), map, errorInfoDtoPage.getTotalElements()));
    }

    private List<Map<String, Object>> toMapList(List<ErrorInfoDto> errorInfoDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (ErrorInfoDto errorInfoDto : errorInfoDtoList) {
            mapList.add(this.toMap(errorInfoDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(ErrorInfoDto errorInfoDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", errorInfoDto.getBeginDate());
        map.put("content", errorInfoDto.getContent());
        map.put("createdByCode", errorInfoDto.getCreatedByCode());
        map.put("createdDate", errorInfoDto.getCreatedDate());
        map.put("dataStateCode", errorInfoDto.getDataStateCode());
        map.put("departmentCode", errorInfoDto.getDepartmentCode());
        map.put("endDate", errorInfoDto.getEndDate());
        map.put("errorInfoCode", errorInfoDto.getErrorInfoCode());
        map.put("errorInfoId", errorInfoDto.getErrorInfoId());
        map.put("lastModifiedByCode", errorInfoDto.getLastModifiedByCode());
        map.put("lastModifiedDate", errorInfoDto.getLastModifiedDate());
        map.put("orgCode", errorInfoDto.getOrgCode());
        map.put("permissionCodes", errorInfoDto.getPermissionCodes());
        map.put("roleCodes", errorInfoDto.getRoleCodes());
        map.put("stateCode", errorInfoDto.getStateCode());
        map.put("typeCode", errorInfoDto.getTypeCode());
        map.put("version", errorInfoDto.getVersion());
        map.put("wfId", errorInfoDto.getWfId());

        return map;
    }
}