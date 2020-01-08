package com.example.springboot_war1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: szp
 * @Date: 2020/1/8 21:28
 * @Description: 沈泽鹏写点注释吧
 */
@RestController
public class HelloController {
    @GetMapping
    public String getHello(){
        return "asdiaosidf";
    }

}
