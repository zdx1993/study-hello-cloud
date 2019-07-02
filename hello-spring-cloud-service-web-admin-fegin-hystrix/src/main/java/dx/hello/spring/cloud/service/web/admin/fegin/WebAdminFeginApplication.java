package dx.hello.spring.cloud.service.web.admin.fegin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @description: 测试fegin调用远程服务
 * @author: zhang.da.xin
 * @create: 2019-06-23 08:39
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard
public class WebAdminFeginApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebAdminFeginApplication.class,args);
    }
}
