package com.wt.cloud.service;

import com.wt.springcloud.entities.CommonResult;
import com.wt.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author :Alanwti
 * @date :2022/10/22 13:28
 * @description:
 */

@Component
@FeignClient(value = "CLOUD-PAYMENT-SERVICE")
public interface PaymentFeignService {
    @GetMapping(value = "/payment/get/{id}")
    CommonResult<Payment> getPaymentById(@PathVariable("id") Long id);
    @GetMapping(value = "/payment/feign/timeout")
     String paymentFeignTimeout();
}
