package com.muzhi.merchanteureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MerchantEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(MerchantEurekaApplication.class, args);
    }

}
