package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class OnlineBookHouseEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookHouseEurekaServerApplication.class, args);
	}

}
