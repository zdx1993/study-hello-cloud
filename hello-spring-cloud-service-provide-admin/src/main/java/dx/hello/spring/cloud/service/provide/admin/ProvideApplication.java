package dx.hello.spring.cloud.service.provide.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: service provide
 * @author: zhang.da.xin
 * @create: 2019-06-22 19:26
 **/

@EnableEurekaClient
@SpringBootApplication
public class ProvideApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProvideApplication.class,args);
    }
}
