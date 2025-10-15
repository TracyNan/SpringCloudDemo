package com.nan.application.feign;

import com.nan.user.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "userService")
public interface UserServiceClient {
    @GetMapping("/getUsers")
    List<UserDTO> getUserList();
}
