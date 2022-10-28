package com.wt.cloud.service.impl;

import com.wt.cloud.service.PaymentFeignService;
import com.wt.springcloud.entities.CommonResult;
import com.wt.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @author :Alanwti
 * @date :2022/10/23 14:44
 * @description:
 */
@Component
public class PaymentFeignServiceImpl implements PaymentFeignService {
    @Override
    public CommonResult<Payment> getPaymentById(Long id) {
        return new CommonResult<>(404,"服务调用失败",null
        );

    }

    @Override
    public String paymentFeignTimeout() {
        return "服务调用失败，提示来自：cloud-consumer-feign-order80";

    }
}
