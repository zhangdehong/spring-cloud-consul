package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:39 上午 2021/1/3
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerRibbonApplication {

    public static void main (String[] args) {
        SpringApplication.run(ConsumerRibbonApplication.class, args);
    }
}
