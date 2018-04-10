package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import top.cardone.context.annotation.CardOneAnnotationBeanNameGenerator;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@Configuration
@ComponentScan(basePackages = {"top.cardone"}, nameGenerator = CardOneAnnotationBeanNameGenerator.class, lazyInit = true)
@Import({
        org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.MessageSourceAutoConfiguration.class,
        org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration.class
})
@ImportResource({"file:config/applicationContext.xml", "file:config/applicationContext.groovy"})
public class ProviderApplication {
    /**
     * 主方法
     *
     * @param args 参数
     * @throws Exception 异常
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApplication.class, args);
    }
}