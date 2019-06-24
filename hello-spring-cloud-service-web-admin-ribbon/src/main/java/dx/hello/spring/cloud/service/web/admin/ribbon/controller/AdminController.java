package dx.hello.spring.cloud.service.web.admin.ribbon.controller;

import dx.hello.spring.cloud.service.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 负载均衡测试
 * @author: zhang.da.xin
 * @create: 2019-06-22 23:39
 **/

@RestController
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("say_hello")
    public String sayHello(){
        return "负载均衡后的结果---" + adminService.getHello();
    }
}
