package com.longer.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@SpringBootApplication
@EnableEurekaServer//EurekaServer服务器启动类，接受其他微服务注册进来
public class EurekaServe7002_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServe7002_App.class,args);
    }
}
