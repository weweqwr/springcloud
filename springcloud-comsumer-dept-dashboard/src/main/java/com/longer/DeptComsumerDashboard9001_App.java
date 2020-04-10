package com.longer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableHystrixDashboard
public class DeptComsumerDashboard9001_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptComsumerDashboard9001_App.class, args);
    }
}
