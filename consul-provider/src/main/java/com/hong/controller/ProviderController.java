package com.hong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  5:45 下午 2021/1/2
 */
@RestController
public class ProviderController {

    @Value("${server.port}")
    private Integer port;

    @GetMapping("/actuator/health")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/provider/sayHello")
    public String sayHello (String name) {
        return "from port:" + port + " name:" + name;
    }
}
