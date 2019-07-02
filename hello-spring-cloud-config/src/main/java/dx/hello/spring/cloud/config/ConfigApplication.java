package dx.hello.spring.cloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @description: 服务的统一配置中心
 * @author: zhang.da.xin
 * @create: 2019-06-25 23:03
 **/

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //开启服务为一个配置中心
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    }
}
