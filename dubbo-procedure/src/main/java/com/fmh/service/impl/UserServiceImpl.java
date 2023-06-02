package com.fmh.service.impl;

import com.fmh.api.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@Component
@DubboService(version = "1.0")
public class UserServiceImpl implements UserService {
    @Override
    public String hello(String str) {
        return str;
    }
}
