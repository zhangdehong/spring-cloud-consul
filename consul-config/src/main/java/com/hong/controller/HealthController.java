package com.hong.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  6:40 下午 2021/1/2
 */
@RestController
public class HealthController {

    @GetMapping("/actuator/health")
    public String health () {
        return "SUCCESS";
    }
}
