package dx.hello.spring.cloud.service.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @description: 测试UI---web层
 * @author: zhang.da.xin
 * @create: 2019-06-22 23:36
 **/

@Service
public class AdminService extends BaseService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "fallBack")
    public String getHello() throws InterruptedException {
        Thread.sleep(10000);
        //使用服务名称,找到服务提供者的ip和端口,根据url对应的服务,传递参数就行了
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/hello",String.class);
    }
}
