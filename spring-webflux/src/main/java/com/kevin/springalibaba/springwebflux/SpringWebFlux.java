package com.kevin.springalibaba.springwebflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.kevin.springalibaba.springwebflux", "org.springframework.security.samples"})
public class SpringWebFlux {
    public static void main(String[] args) {
        SpringApplication.run(SpringWebFlux.class, args);
    }
}
