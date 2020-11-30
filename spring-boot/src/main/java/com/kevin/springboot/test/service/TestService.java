package com.kevin.springboot.test.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @SentinelResource(value = "getString")
    public String getString(){
        return "Hello Kevin.";
    }
}
