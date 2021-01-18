package com.kevin.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *  Spring boot 的demo类
 *  @Author: Kevin Zhang @Date: 2020-11-23 16:56
**/
@SpringBootApplication(scanBasePackages = {"com.kevin.springboot"})
public class SpringBoot {
    public static void main(String[] args) {
        SpringApplication.run(SpringBoot.class, args);
    }
}
