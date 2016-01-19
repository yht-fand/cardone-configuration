package top.cardone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.freemarker.FreeMarkerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * 主执行端
 *
 * @author yao hai tao
 */
@ImportResource(locations = {"file:/${spring.configLocation}"})
@Import({
        DispatcherServletAutoConfiguration.class,
        ServerPropertiesAutoConfiguration.class,
        EmbeddedServletContainerAutoConfiguration.class,
        WebMvcAutoConfiguration.class,
        FreeMarkerAutoConfiguration.class,
        ErrorMvcAutoConfiguration.class,
        HttpEncodingAutoConfiguration.class,
        HttpMessageConvertersAutoConfiguration.class,
        MultipartAutoConfiguration.class
})
@ComponentScan
public class ConsumerApplication {
    /**
     * 主方法
     *
     * @param args 参数
     * @throws Exception 异常
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}