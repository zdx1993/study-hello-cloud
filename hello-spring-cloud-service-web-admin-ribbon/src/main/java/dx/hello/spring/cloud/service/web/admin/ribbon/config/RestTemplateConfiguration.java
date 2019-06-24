package dx.hello.spring.cloud.service.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 配置RestTemplate
 * @author: zhang.da.xin
 * @create: 2019-06-22 23:12
 **/

@Configuration //相当于一个配置bean的xml
public class RestTemplateConfiguration {
    //需要向IOC容器中加入RestTemplate的Bean,从而实现自动注入RestTemplate,让spring去管理这个Bean的生命周期!
    @Bean
    @LoadBalanced //使这个restTemplate具备负载均衡的能力!
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
