package dx.hello.spring.cloud.service.provide.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @description: 测试用的controller
 * @author: zhang.da.xin
 * @create: 2019-06-22 22:08
 **/

@Controller
public class HelloController {
    @Value("${server.port}")
    private Integer port;

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
//    @ResponseBody
    public String hello(){
        return String.format("你好啊%s---端口%s","666",port);
    }

    public HelloController() {
        System.out.println("测试controller创建了");
    }
}
