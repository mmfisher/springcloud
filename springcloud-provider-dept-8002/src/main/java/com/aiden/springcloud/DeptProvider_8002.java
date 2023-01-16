package com.aiden.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 21:08
 */
@SpringBootApplication
//在服务启动后注册到eureka service
@EnableEurekaClient
public class DeptProvider_8002 {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider_8002.class, args);
    }
}
