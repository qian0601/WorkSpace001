package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //开启config server 可用
public class SpringcloudConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudConfigServerApplication.class, args);
    }

}
