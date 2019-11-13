package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Gqprovider8086Application {

    public static void main(String[] args) {
        SpringApplication.run(Gqprovider8086Application.class, args);
    }

}
