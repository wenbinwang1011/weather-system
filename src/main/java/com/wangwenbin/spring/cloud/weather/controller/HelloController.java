package com.wangwenbin.spring.cloud.weather.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 声明此类是一个controller
 * */
@RestController
public class HelloController {

    //@RequestMapping("/hello")
//    @PostMapping("/hello")
    @GetMapping("hello")
    public String hello(){
        return "Hello World";
    }


}
