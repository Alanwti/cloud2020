package com.wt.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author :Alanwti
 * @date :2022/10/22 13:14
 * @description:
 */
@SpringBootApplication
@EnableEurekaClient
public class PaymentMain8002
{
    public static void main(String[] args)
    {
        SpringApplication.run(PaymentMain8002.class,args);
    }
}
