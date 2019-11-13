package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class Ljhprovider8082Application {

    public static void main(String[] args) {
        SpringApplication.run(Ljhprovider8082Application.class, args);
    }

}
