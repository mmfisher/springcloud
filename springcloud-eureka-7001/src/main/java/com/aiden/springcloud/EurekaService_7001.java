package com.aiden.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 21:08
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaService_7001 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaService_7001.class, args);
    }
}
