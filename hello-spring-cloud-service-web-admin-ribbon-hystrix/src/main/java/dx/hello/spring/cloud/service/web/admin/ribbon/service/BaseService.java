package dx.hello.spring.cloud.service.web.admin.ribbon.service;

/**
 * @description: 基础的service方法
 * @author: zhang.da.xin
 * @create: 2019-06-23 09:46
 **/


public class BaseService {
    public String fallBack(){
        return "测试通用的熔断异常方法";
    }
}
