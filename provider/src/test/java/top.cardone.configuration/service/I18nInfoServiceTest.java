package top.cardone.configuration.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.context.ApplicationContextHolder;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ProviderApplication.class)
public class I18nInfoServiceTest {
	@Test
	public void readContentByCode() throws Exception {
		String content = ApplicationContextHolder.getBean(I18nInfoService.class).readOneContentByCode("zh-cn", "test", "test");

		System.out.println(content);
	}

}