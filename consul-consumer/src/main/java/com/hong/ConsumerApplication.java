package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  6:00 下午 2021/1/2
 */
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

    public static void main (String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
