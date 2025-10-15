package com.nan.application.controller;

import com.nan.application.feign.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApplicationController {
    @Autowired
    UserServiceClient userServiceClient;

    @GetMapping("/hello")
    public String hello() {
        return "success";
    }

    @GetMapping("/feignTest")
    public Object feignTest() {
        return userServiceClient.getUserList();
    }
}
