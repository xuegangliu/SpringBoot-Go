package com.lxg.consumerservice.service;

import org.springframework.stereotype.Component;

@Component
public class UserServiceHystrix implements UserService {

    @Override
    public String getUser() {
        return "error";
    }
}