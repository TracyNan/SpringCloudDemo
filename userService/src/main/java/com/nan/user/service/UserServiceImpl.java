package com.nan.user.service;

import com.nan.user.dao.UserDao;
import com.nan.user.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    UserDao userDao;

    public List<UserEntity> getUserInfo() {
        return userDao.findAll();
    }

}
