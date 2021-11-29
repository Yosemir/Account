package com.nttdata.account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AcountApplication {


	public static void main(String[] args) {
		SpringApplication.run(AcountApplication.class, args);
	}

}
