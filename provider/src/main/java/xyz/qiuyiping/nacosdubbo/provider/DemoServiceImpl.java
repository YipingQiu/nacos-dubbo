package xyz.qiuyiping.nacosdubbo.provider;

import org.apache.dubbo.config.annotation.Service;
import xyz.qiuyiping.nacosdubbo.api.DemoService;

@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hello " + name;
    }
}
