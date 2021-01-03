package com.hong.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:27 上午 2021/1/3
 */
@RestController
public class ProviderTwoController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/h-e-a-l-t-h")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/two/sayHello/{name}")
    public String sayHello (@PathVariable("name") String name) {
        return "from port：" + port + " name:" + name;
    }
}
