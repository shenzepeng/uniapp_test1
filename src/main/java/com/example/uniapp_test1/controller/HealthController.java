package com.example.uniapp_test1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: szp
 * @Date: 2019/10/26 21:56
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class HealthController {
    @GetMapping("health")
    public String health(){
        return "service is health";
    }
}
