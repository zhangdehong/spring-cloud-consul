package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:03 上午 2021/1/3
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderOneApplication {

    public static void main (String[] args) {
        SpringApplication.run(ProviderOneApplication.class, args);
    }
}
