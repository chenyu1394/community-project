package com.chenyu.communityadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableAdminServer
@EnableEurekaClient
@SpringBootApplication
public class CommunityAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommunityAdminApplication.class, args);
    }

}
