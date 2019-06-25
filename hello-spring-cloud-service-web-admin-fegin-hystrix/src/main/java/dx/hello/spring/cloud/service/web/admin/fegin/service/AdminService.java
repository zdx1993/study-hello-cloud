package dx.hello.spring.cloud.service.web.admin.fegin.service;

import dx.hello.spring.cloud.service.web.admin.fegin.service.impl.AdminServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Service
@FeignClient(name = "HELLO-SPRING-CLOUD-SERVICE-ADMIN",fallback = AdminServiceImpl.class)
public interface AdminService {
    @GetMapping("/hello")
//    经测试,get方法无需标注@RequestParam,参数也会传递到服务提供者上,但是要记就统一加上@RequestParam比较好
//    public String sayHelloFegin(String msg);
    public String sayHelloFegin(String msg);

    @PostMapping("/block_hello")
    public String blockHello( @RequestParam("msg") String msg);

    @PostMapping("/hello_send_msg")
    //当不加@RequestParam时,参数无法传递,服务提供者接收到的是null
    public String helloSendMsg(String msg);
}
