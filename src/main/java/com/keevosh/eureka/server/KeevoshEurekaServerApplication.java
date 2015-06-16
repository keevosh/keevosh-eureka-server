package com.keevosh.eureka.server;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KeevoshEurekaServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(KeevoshEurekaServerApplication.class).web(true).run(args);
    }
}
