package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  6:37 下午 2021/1/2
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ConfigApplication {

    public static void main (String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
}
