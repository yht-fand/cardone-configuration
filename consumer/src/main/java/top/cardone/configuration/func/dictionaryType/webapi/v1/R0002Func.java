package top.cardone.configuration.func.dictionaryType.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryTypeDto;
import top.cardone.configuration.service.DictionaryTypeService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;

import java.util.List;
import java.util.Map;

/**
 * 字典类别 - 查询列表
 */
@Component("/web-api/v1/configuration/dictionaryType/r0002.json")
public class R0002Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        List<DictionaryTypeDto> dictionaryTypeDtoList = ApplicationContextHolder.getBean(DictionaryTypeService.class).findList(DictionaryTypeDto.class, map);

        return this.toMapList(dictionaryTypeDtoList);
    }

    private List<Map<String, Object>> toMapList(List<DictionaryTypeDto> dictionaryTypeDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (DictionaryTypeDto dictionaryTypeDto : dictionaryTypeDtoList) {
            mapList.add(this.toMap(dictionaryTypeDto));
        }

        return mapList;
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
        map.put("stateCode", dictionaryTypeDto.getStateCode());
        map.put("version", dictionaryTypeDto.getVersion());
        map.put("wfId", dictionaryTypeDto.getWfId());

        return map;
    }
}