package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  8:02 下午 2021/1/3
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DiscoveryClientApplication {

    public static void main (String[] args) {
        SpringApplication.run(DiscoveryClientApplication.class, args);
    }
}
