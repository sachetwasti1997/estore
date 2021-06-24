package com.sachet.estore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EstoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstoreApplication.class, args);
    }

}
