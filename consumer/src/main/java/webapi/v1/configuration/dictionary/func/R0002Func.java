package webapi.v1.configuration.dictionary.func;

import org.springframework.stereotype.Component;
import top.cardone.core.util.func.Func1;

import top.cardone.configuration.dto.DictionaryDto;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * 字典 - 查询列表
 */
@Component("/web-api/v1/configuration/dictionary/r0002.json")
public class R0002Func implements Func1<Map<String, Object>, Map<String, Object>> {
    @Override
    public Map<String, Object> func(Map<String, Object> map) {
        return null;
    }

    private List<Map<String, Object>> toMapList(List<DictionaryDto> dictionaryDtoList) {
        List<Map<String, Object>> mapList = Lists.newArrayList();

        for (DictionaryDto dictionaryDto : dictionaryDtoList) {
            mapList.add(this.toMap(dictionaryDto));
        }

        return mapList;
    }

    private Map<String, Object> toMap(DictionaryDto dictionaryDto) {
        Map<String, Object> map = Maps.newHashMap();

        map.put("beginDate", dictionaryDto.getBeginDate());
        map.put("createdByCode", dictionaryDto.getCreatedByCode());
        map.put("createdDate", dictionaryDto.getCreatedDate());
        map.put("dataStateCode", dictionaryDto.getDataStateCode());
        map.put("departmentCode", dictionaryDto.getDepartmentCode());
        map.put("dictionaryCode", dictionaryDto.getDictionaryCode());
        map.put("dictionaryId", dictionaryDto.getDictionaryId());
        map.put("dictionaryTypeCode", dictionaryDto.getDictionaryTypeCode());
        map.put("endDate", dictionaryDto.getEndDate());
        map.put("explain", dictionaryDto.getExplain());
        map.put("lastModifiedByCode", dictionaryDto.getLastModifiedByCode());
        map.put("lastModifiedDate", dictionaryDto.getLastModifiedDate());
        map.put("name", dictionaryDto.getName());
        map.put("order", dictionaryDto.getOrder());
        map.put("orgCode", dictionaryDto.getOrgCode());
        map.put("permissionCodes", dictionaryDto.getPermissionCodes());
        map.put("remark", dictionaryDto.getRemark());
        map.put("roleCodes", dictionaryDto.getRoleCodes());
        map.put("stateCode", dictionaryDto.getStateCode());
        map.put("value", dictionaryDto.getValue());
        map.put("version", dictionaryDto.getVersion());
        map.put("wfId", dictionaryDto.getWfId());

        return map;
    }
}
