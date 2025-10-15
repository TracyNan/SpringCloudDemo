package com.nan.user.service;

import com.nan.user.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class UserServiceImpl {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("getUserInfo")
    public List<UserDTO> getUserInfo() {
        return jdbcTemplate.query("select * from nan.user", BeanPropertyRowMapper.newInstance(UserDTO.class));
    }
}
