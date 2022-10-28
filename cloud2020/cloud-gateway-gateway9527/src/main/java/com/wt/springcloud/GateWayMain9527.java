package com.wt.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :Alanwti
 * @date :2022/10/23 20:28
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class GateWayMain9527 {
    public static void main(String[] args)
    {
        SpringApplication.run(GateWayMain9527.class,args);
    }

}
