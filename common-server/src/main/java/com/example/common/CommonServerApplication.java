package com.example.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class CommonServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommonServerApplication.class, args);
	}

}
