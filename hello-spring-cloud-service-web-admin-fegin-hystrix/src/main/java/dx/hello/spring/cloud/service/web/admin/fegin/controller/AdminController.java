package dx.hello.spring.cloud.service.web.admin.fegin.controller;

import dx.hello.spring.cloud.service.web.admin.fegin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 测试feign调用
 * @author: zhang.da.xin
 * @create: 2019-06-23 08:52
 **/

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("say_hello_feign")
    public String sayHelloFegin(String msg){
        return adminService.sayHelloFegin(msg);
    }

    //测试调用使用get请求,转发使用post请求(方法阻塞,测试熔断类是否能获取请求参数)
    @GetMapping("/test_block_get_to_post")
    public String blockGetToPost(String msg){
        return adminService.blockHello(msg);
    }

    //测试调用使用get请求,转发使用post请求
    @GetMapping("/test_get_to_post")
    public String getToPost(String msg){
        return adminService.helloSendMsg(msg);
    }
}
