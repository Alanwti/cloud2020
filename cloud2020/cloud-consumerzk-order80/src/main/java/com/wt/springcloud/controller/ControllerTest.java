package com.wt.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :Alanwti
 * @date :2022/10/20 10:11
 * @description:
 */
@RestController
public class ControllerTest {
    @RequestMapping("/cao")
    public String TestFor(){
        return "尼玛有毒";
    }
}
