package dx.hello.spring.cloud.service.web.admin.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @description: 服务提供者测试类
 * @author: zhang.da.xin
 * @create: 2019-06-22 23:03
 **/

@EnableDiscoveryClient //发现服务提供者
@SpringBootApplication
@EnableHystrix
public class WebAdminRibbonApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminRibbonApplication.class,args);
    }
}
