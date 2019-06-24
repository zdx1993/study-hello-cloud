package dx.hello.spring.cloud.service.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @description: 服务提供者测试类
 * @author: zhang.da.xin
 * @create: 2019-06-22 23:03
 **/

@EnableDiscoveryClient //发现服务提供者
@SpringBootApplication
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}
