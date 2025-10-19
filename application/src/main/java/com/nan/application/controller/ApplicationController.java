package com.nan.application.controller;

import com.nan.application.feign.UserServiceClient;
import com.nan.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/app")
public class ApplicationController {
    @Autowired
    UserServiceClient userServiceClient;

    @GetMapping("/hello")
    public String hello() {
        return "success";
    }

    @GetMapping("/feignTest")
    public List<UserEntity> feignTest() {
        return userServiceClient.getUserList();
    }
}
