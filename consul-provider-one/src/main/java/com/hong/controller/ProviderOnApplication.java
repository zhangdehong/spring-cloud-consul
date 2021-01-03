package com.hong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:06 上午 2021/1/3
 */
@RestController
public class ProviderOnApplication {

    @Value("${server.port}")
    private String port;

    @GetMapping("/health")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/provider/sayHello/{name}")
    public String sayHello (@PathVariable("name") String name) {
        return "one provider from port :" + port + "：name:" + name;
    }
}
