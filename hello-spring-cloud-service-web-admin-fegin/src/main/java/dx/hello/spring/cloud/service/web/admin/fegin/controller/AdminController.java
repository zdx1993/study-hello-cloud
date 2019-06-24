package dx.hello.spring.cloud.service.web.admin.fegin.controller;

import dx.hello.spring.cloud.service.web.admin.fegin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
    public String sayHelloFegin(){
        return adminService.sayHelloFegin();
    }
}
