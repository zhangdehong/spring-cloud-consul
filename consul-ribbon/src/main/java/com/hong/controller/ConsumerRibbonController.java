package com.hong.controller;

import com.hong.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:41 上午 2021/1/3
 */
@RestController
public class ConsumerRibbonController {

    private static final String URL = "http://hong-two-consul";

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ProviderService providerService;

    @Value("${server.port}")
    private String port;

    @GetMapping("/h-e-a-l-t-h")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/consumer/sayHelloOne/{name}")
    public String sayHelloOne (@PathVariable("name") String name) {
        return providerService.sayHello(name);
    }

    @GetMapping("/consumer/sayHelloTwo/{name}")
    public String sayHelloTwo (@PathVariable("name") String name) {
        return restTemplate.getForObject(URL + "/two/sayHello/" + name, String.class);
    }
}
