package top.cardone.configuration.service.impl;

import com.google.common.collect.Maps;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;

import java.util.List;
import java.util.Map;


/**
 * Created by gongzw on 2016/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class DictionaryServiceImplTest {
    @Test
    public void testFindListByTypeCode() throws Exception {
        Map<String, Object> map = Maps.newHashMap();
        map.put("dictionaryTypeCode", "lang");
        List<Map<String, Object>> l = ApplicationContextHolder.getBean(DictionaryService.class).findListByDictionaryTypeCode("lang");
        Assume.assumeTrue(l.size() == 2);
    }

    @Test
    public void testPageByCode() throws Exception {
        Map<String, Object> map = Maps.newHashMap();
        map.put("dictionaryCode", "");
        map.put("dictionaryTypeCode", "");
        map.put("pageSize", 20);
        map.put("pageNumber", 1);
        Page<Map<String, Object>> dictionaryDtoPage = ApplicationContextHolder.getBean(DictionaryService.class).pageByCode(map);
        Assume.assumeTrue(dictionaryDtoPage.getTotalElements() == 112);
    }
}