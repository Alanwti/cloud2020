package com.wt.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author :Alanwti
 * @date :2022/10/20 9:39
 * @description:
 */
@RestController
@Slf4j
public class OderZKController {
    public static final String INVOKE_URL="http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping(value = "/consumer/payment/zk")
    public String PaymentInfo(){
        System.out.println("消费者调用支付服务(zookeeper)--->result:");
        return restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);

    }
    @GetMapping("/666")
    public String Print666(){
        System.out.println(666);
        return "666";
    }
}
