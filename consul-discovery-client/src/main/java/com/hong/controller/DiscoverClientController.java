package com.hong.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  8:03 下午 2021/1/3
 */
@RestController
public class DiscoverClientController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/h-e-a-l-t-h")
    public String health () {
        return "SUCCESS";
    }

    @GetMapping("/discover/client/{name}")
    public String sayHello (@PathVariable("name") String name) {
        return "from port :" + port + " name:" + name;
    }

    @GetMapping("/server/{serviceId}")
    public List<ServiceInstance> getServer (@PathVariable("serviceId") String serviceId) {
        return discoveryClient.getInstances(serviceId);
    }
}
