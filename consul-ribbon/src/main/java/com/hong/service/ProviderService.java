package com.hong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:43 上午 2021/1/3
 */
@FeignClient("hong-one-consul")
public interface ProviderService {

    @GetMapping("/provider/sayHello/{name}")
    String sayHello (@PathVariable("name") String name);
}
