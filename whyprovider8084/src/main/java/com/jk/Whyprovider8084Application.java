package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Whyprovider8084Application {

    public static void main(String[] args) {
        SpringApplication.run(Whyprovider8084Application.class, args);
    }

}
