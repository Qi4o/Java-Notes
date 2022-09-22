package com.atguigu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Qiao
 * @Create 2022/6/21 10:13
 */


@RestController
public class HelloController {

    @RequestMapping("/2.jpg")
    public String hello(){
        return "aaaa";
    }
}
