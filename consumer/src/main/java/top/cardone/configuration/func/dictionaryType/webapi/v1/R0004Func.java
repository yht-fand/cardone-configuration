package top.cardone.configuration.func.dictionaryType.webapi.v1;

import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryTypeDto;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.Map;

/**
 * 字典类别 - 查询
 */
@Component("/web-api/v1/configuration/dictionaryType/r0004.json")
public class R0004Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        DictionaryTypeDto dictionaryTypeDto = ApplicationContextHolder.getBean(DictionaryTypeService.class).findOne(DictionaryTypeDto.class, map);

        return this.toMap(dictionaryTypeDto);
    }

    private Map<String, Object> toMap(DictionaryTypeDto dictionaryTypeDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", dictionaryTypeDto.getBeginDate());
        map.put("createdByCode", dictionaryTypeDto.getCreatedByCode());
        map.put("createdDate", dictionaryTypeDto.getCreatedDate());
        map.put("dataStateCode", dictionaryTypeDto.getDataStateCode());
        map.put("departmentCode", dictionaryTypeDto.getDepartmentCode());
        map.put("dictionaryTypeCode", dictionaryTypeDto.getDictionaryTypeCode());
        map.put("dictionaryTypeId", dictionaryTypeDto.getDictionaryTypeId());
        map.put("endDate", dictionaryTypeDto.getEndDate());
        map.put("lastModifiedByCode", dictionaryTypeDto.getLastModifiedByCode());
        map.put("lastModifiedDate", dictionaryTypeDto.getLastModifiedDate());
        map.put("name", dictionaryTypeDto.getName());
        map.put("order", dictionaryTypeDto.getOrder());
        map.put("orgCode", dictionaryTypeDto.getOrgCode());
        map.put("parentCode", dictionaryTypeDto.getParentCode());
        map.put("parentTreeCode", dictionaryTypeDto.getParentTreeCode());
        map.put("parentTreeName", dictionaryTypeDto.getParentTreeName());
        map.put("permissionCodes", dictionaryTypeDto.getPermissionCodes());
        map.put("remark", dictionaryTypeDto.getRemark());
        map.put("roleCodes", dictionaryTypeDto.getRoleCodes());
        map.put("siteCode", dictionaryTypeDto.getSiteCode());
        map.put("stateCode", dictionaryTypeDto.getStateCode());
        map.put("systemInfoCode", dictionaryTypeDto.getSystemInfoCode());
        map.put("version", dictionaryTypeDto.getVersion());
        map.put("wfId", dictionaryTypeDto.getWfId());

        return map;
    }
}