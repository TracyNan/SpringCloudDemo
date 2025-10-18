package com.nan.user.controller;

import com.nan.user.dao.UserDao;
import com.nan.user.entity.UserEntity;
import com.nan.user.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserServiceController {
    @Autowired
    UserServiceImpl userService;
    @Autowired
    UserDao userDao;

    @GetMapping("getUsers")
    public List<UserEntity> getUserList() {
        return userService.getUserInfo();
    }

    @GetMapping("getUserByName/{name}")
    public UserEntity getUserByName(@PathVariable String name) {
        return userDao.getUserByName(name);
    }
}
