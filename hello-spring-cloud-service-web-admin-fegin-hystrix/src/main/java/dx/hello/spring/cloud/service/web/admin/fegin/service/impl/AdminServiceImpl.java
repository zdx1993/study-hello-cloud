package dx.hello.spring.cloud.service.web.admin.fegin.service.impl;

import dx.hello.spring.cloud.service.web.admin.fegin.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @description: fegin远程调用的熔断器实现类
 * @author: zhang.da.xin
 * @create: 2019-06-24 23:18
 **/

@Component
public class AdminServiceImpl implements AdminService {


    @Override
    public String sayHelloFegin(String msg) {
        return "测试get方法传递参数,目测原因是url路径后的?传参不会在转发时丢失,而请求体需要额外注意" + msg;
    }

    @Override
    public String blockHello(String msg) {
        return "fegin远程调用provide的阻塞方法,导致调用方的熔断器被触发了------" + msg;
    }

    @Override
    public String helloSendMsg(String msg) {
        return "非阻塞方法 的熔断器触发了---" + msg;
    }
}
