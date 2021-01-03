package com.hong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  6:13 下午 2021/1/2
 */
@FeignClient("hong-consul-provider")
public interface HelloService {

    @GetMapping("/provider/sayHello")
    String sayHello (@RequestParam("name") String name);
}
