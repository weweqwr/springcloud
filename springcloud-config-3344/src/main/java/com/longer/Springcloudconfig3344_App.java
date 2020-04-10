package com.longer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Springcloudconfig3344_App {
    public static void main(String[] args) {
        SpringApplication.run(Springcloudconfig3344_App.class,args);
    }
}
