package com.wt.cloud.controller;

import com.wt.cloud.service.PaymentFeignService;
import com.wt.springcloud.entities.CommonResult;
import com.wt.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author :Alanwti
 * @date :2022/10/22 13:35
 * @description:
 */
@RestController
@Slf4j
public class OrderFeignController {
    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping(value = "/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id)
    {
        return paymentFeignService.getPaymentById(id);
    }
    @GetMapping(value = "/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){
        return paymentFeignService.paymentFeignTimeout();
    //    以前openfeign-ribbon 客户端默认等待1秒钟
    //    现在可以看到源码默认连接时长为10s，默认读取时长为60s
    }

}
