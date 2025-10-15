package com.nan.user.controller;

import com.nan.user.dto.UserDTO;
import com.nan.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceController {
    @Autowired
    UserServiceImpl userService;

    @GetMapping("getUsers")
    public List<UserDTO> getUserList() {
        return userService.getUserInfo();
    }
}
