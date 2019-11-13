package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Wyxprovider8085Application {

    public static void main(String[] args) {
        SpringApplication.run(Wyxprovider8085Application.class, args);
    }

}
