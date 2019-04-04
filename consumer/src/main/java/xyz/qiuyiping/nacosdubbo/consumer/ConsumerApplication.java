package xyz.qiuyiping.nacosdubbo.consumer;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.qiuyiping.nacosdubbo.api.DemoService;

@RestController
@SpringBootApplication
public class ConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }

    @Reference
    private DemoService demoService;

    @GetMapping("/hello")
    public String hello(String name) {
        return demoService.sayHello(name);
    }

}
