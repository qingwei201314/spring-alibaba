package com.kevin.consumer.test.controller;

import com.kevin.consumer.test.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 *  Nacos 消费端
 *  @Author: Kevin Zhang @Date: 2020-11-25 10:15
**/
@RestController
@EnableDiscoveryClient
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private ConsumerService consumerService;

    @RequestMapping(value = "/echo/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable String str) {
        return restTemplate.getForObject("http://spring-boot/echo/" + str, String.class);
    }

    @RequestMapping("/")
    public String home() {
        return "Hello Kevin, this is consumer.";
    }

    /**
     *  限流
     *  @Author: Kevin Zhang @Date: 2020-11-25 11:01
    **/
    @GetMapping(value = "/hello/{name}")
    public String apiHello(@PathVariable String name) {
        return consumerService.sayHello(name);
    }
}
