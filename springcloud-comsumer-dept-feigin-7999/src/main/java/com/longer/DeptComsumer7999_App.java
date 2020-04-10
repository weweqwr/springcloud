package com.longer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.longer"})
//教程有@ComponsentScan("comm.longer")在这里不设置也可以使用
public class DeptComsumer7999_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptComsumer7999_App.class, args);
    }
}
