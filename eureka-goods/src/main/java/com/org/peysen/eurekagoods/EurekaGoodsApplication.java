package com.org.peysen.eurekagoods;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class EurekaGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaGoodsApplication.class, args);
    }

}
