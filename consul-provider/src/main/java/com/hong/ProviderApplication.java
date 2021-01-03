package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  5:43 下午 2021/1/2
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderApplication {

    public static void main (String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
