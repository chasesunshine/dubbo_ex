package com.fmh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Eureka注册中心
 */
@SpringBootApplication
public class ConsumerBootStart {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBootStart.class, args);
    }
}
