package com.wt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :Alanwti
 * @date :2022/10/20 13:52
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientMain80 {
    public static void main(String[] args) {
        SpringApplication.run(ConsulClientMain80.class,args);
    }
}
