package com.wt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author :Alanwti
 * @date :2022/10/19 21:58
 * @description:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OderZKMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OderZKMain80.class,args);
    }
}
