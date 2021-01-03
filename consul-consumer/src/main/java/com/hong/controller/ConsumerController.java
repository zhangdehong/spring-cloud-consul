package com.hong.controller;

import com.hong.service.HelloService;
import com.hong.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  6:02 下午 2021/1/2
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;

    @Autowired
    private ProviderService providerService;

    @GetMapping("/actuator/health")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/consumer/sayHello")
    public String sayHello (String name) {
        providerService.sayHello(name);
        return helloService.sayHello(name);
    }


}
