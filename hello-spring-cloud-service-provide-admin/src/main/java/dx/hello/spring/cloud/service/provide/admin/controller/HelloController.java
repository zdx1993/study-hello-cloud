package dx.hello.spring.cloud.service.provide.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @ResponseBody
    public String hello(String msg){
        return String.format("你好啊%s---端口%s---------" + msg,"666",port);
    }

    //会触发熔断器的阻塞方法
    @PostMapping("/block_hello")
    @ResponseBody
    public String blockHello(String msg){
        try { //模拟阻塞方法
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return String.format("你好啊%s---端口%s---" + msg,"666",port);
    }
    //测试传值方法
    @PostMapping("/hello_send_msg")
    @ResponseBody
    public String helloSendMsg(String msg){
        return String.format("你好啊%s---端口%s---" + msg,"666",port);
    }
}
