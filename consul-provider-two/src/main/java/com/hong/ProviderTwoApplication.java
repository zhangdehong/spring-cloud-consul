package com.hong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:22 上午 2021/1/3
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ProviderTwoApplication {

    public static void main (String[] arges) {
        SpringApplication.run(ProviderTwoApplication.class, arges);
    }
}
