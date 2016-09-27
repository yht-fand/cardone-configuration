package top.cardone.configuration.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.cardone.ProviderApplication;
import top.cardone.context.ApplicationContextHolder;

/**
 * Created by cardone-home-001 on 2016/4/20.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ProviderApplication.class)
public class ErrorInfoServiceTest {
	@Test
	public void readContentByCode() throws Exception {
		String content = ApplicationContextHolder.getBean(ErrorInfoService.class).readOneContentByCode("1", "10000001", "test");

		System.out.println(content);
	}
}