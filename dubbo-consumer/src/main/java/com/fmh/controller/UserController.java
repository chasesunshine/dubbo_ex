package com.fmh.controller;

import com.fmh.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @DubboReference(version = "1.0")
    private UserService userService;

    @GetMapping("/user")
    public String user() {
        return userService.hello("只因你太美");
    }
}
