package top.cardone.configuration.func.dictionary.webapi.v1;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;
import top.cardone.configuration.dto.DictionaryDto;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.core.util.func.Func1;
import top.cardone.data.support.PageSupport;

import java.util.List;
import java.util.Map;

/**
 * 字典 - 查询分页
 */
@Component("/web-api/v1/configuration/dictionary/r0003.json")
public class R0003Func implements Func1<Object, Map<String, Object>> {
    @Override
    public Object func(Map<String, Object> map) {
        Page<DictionaryDto> dictionaryDtoPage = ApplicationContextHolder.getBean(DictionaryService.class).page(DictionaryDto.class, map);

        return ApplicationContextHolder.func(PageSupport.class, pageSupport -> pageSupport.newMap(this.toMapList(dictionaryDtoPage.getContent()), map, dictionaryDtoPage.getTotalElements()));
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
        map.put("siteCode", dictionaryDto.getSiteCode());
        map.put("stateCode", dictionaryDto.getStateCode());
        map.put("systemInfoCode", dictionaryDto.getSystemInfoCode());
        map.put("value", dictionaryDto.getValue());
        map.put("version", dictionaryDto.getVersion());
        map.put("wfId", dictionaryDto.getWfId());

        return map;
    }
}