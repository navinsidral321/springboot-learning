package com.example.JavaSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("get")
    public String getMethod(){
        return "hello world";
    }
}
