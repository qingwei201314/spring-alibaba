package com.kevin.consumer;

import com.alibaba.cloud.sentinel.annotation.SentinelRestTemplate;
import com.kevin.consumer.test.controller.ConsumerController;
import com.kevin.consumer.util.ConsumerExceptionUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 *  Nacos 服务消费端
 *  @Author: Kevin Zhang @Date: 2020-11-25 9:54
**/
@SpringBootApplication(scanBasePackages = {"com.kevin.consumer"})
public class ConsumerApplication {
    private static Logger log = LoggerFactory.getLogger(ConsumerController.class);

    @LoadBalanced
    @Bean
    @SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ConsumerExceptionUtil.class)
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
