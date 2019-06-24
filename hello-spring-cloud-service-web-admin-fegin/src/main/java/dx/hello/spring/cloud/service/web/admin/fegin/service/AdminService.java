package dx.hello.spring.cloud.service.web.admin.fegin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@FeignClient("HELLO-SPRING-CLOUD-SERVICE-ADMIN")
public interface AdminService {
    @RequestMapping("/hello")
    public String sayHelloFegin();

}
