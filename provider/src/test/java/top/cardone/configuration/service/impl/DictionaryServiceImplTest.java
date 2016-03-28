package top.cardone.configuration.service.impl;

import com.google.common.collect.Maps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.configuration.service.DictionaryService;
import top.cardone.context.ApplicationContextHolder;
import top.cardone.context.util.DateUtils;

import java.util.Date;
import java.util.Map;

import static org.junit.Assert.assertNotNull;

/**
 * Created by yht on 16-3-28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProviderApplication.class)
public class DictionaryServiceImplTest {
    @Test
    public void testInsertCache() throws Exception {
        Map<String,Object> insert = Maps.newHashMap();

        insert.put("dictionaryTypeCode","test");
        insert.put("dictionaryCode","test");

        ApplicationContextHolder.getBean(DictionaryService.class).insertCache(insert);
    }
}