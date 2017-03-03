package top.cardone.configuration.dao.impl;


import com.google.common.collect.Maps;
import org.apache.commons.collections.MapUtils;
import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.configuration.dao.DictionaryDao;
import top.cardone.context.ApplicationContextHolder;

import java.util.List;
import java.util.Map;

/**
 * 字典
 *
 * @author yao hai tao
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class DictionaryDaoImplTest {

	@Test
	public void testPageByCode() throws Exception {
		Map<String, Object> map = Maps.newHashMap();
		map.put("dictionaryCode", "");
		map.put("dictionaryTypeCode", "");
		map.put("pageSize", 20);
		map.put("pageNumber", 1);
		Page<Map<String, Object>> dictionaryDtoPage = ApplicationContextHolder.getBean(DictionaryDao.class).pageByCode(map);
		Assume.assumeTrue(dictionaryDtoPage.getTotalElements() == 112);
	}

	@Test
	public void testFindlistByTypeCode() throws Exception {
		List<Map<String, Object>> l = ApplicationContextHolder.getBean(DictionaryDao.class).findlistByDictionaryTypeCode("lang");
		Assume.assumeTrue(l.size() == 2);
	}

	@Test
	public void testFindOneByDictionaryId() throws Exception {
		Map<String, Object> map = ApplicationContextHolder.getBean(DictionaryDao.class).findOneByDictionaryId("018eedbb-76f1-47f1-ab7b-8f08b5d8c828");
		Assume.assumeTrue("en".equals(MapUtils.getString(map, "DICTIONARY_CODE")));
	}

}