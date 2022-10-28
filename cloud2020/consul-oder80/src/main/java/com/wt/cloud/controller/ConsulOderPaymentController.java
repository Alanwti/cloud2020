package com.wt.cloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author :Alanwti
 * @date :2022/10/20 13:57
 * @description:
 */
@RestController
@Slf4j
public class ConsulOderPaymentController {
    public static final String INVOKE_URL = "http://consul-provider-payment";
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String getConsulInfo() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);


    }

    @GetMapping(value = "/consumer/payment/consul1")
    public String PaymentInfo() {
        System.out.println("消费者调用支付服务(zookeeper)--->result:");
        return restTemplate.getForObject(INVOKE_URL + "/payment/consul", String.class);

    }
}
