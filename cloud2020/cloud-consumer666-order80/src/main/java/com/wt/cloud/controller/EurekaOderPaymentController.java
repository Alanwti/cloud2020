package com.wt.cloud.controller;

import com.wt.springcloud.entities.CommonResult;
import com.wt.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
public class EurekaOderPaymentController {
    public static final String INVOKE_URL = "http://cloud-payment-service";
    @Resource
    RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult create(Payment payment) {
        return restTemplate.postForObject(INVOKE_URL + "/payment/create/",payment,CommonResult.class);


    }

    @GetMapping(value = "/consumer/payment/get/{id}")
    public String PaymentInfo(@PathVariable("id") long id) {

        return restTemplate.getForObject(INVOKE_URL + "/payment/get/"+id, String.class);

    }
}
