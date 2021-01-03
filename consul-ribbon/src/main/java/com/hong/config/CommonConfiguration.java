package com.hong.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: zhang-dehong
 * @Describe: TODO
 * @Date Create by  11:48 上午 2021/1/3
 */
@Configuration
public class CommonConfiguration {
    
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate () {
        return new RestTemplate();
    }
}
