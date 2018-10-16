package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderUser2RunApp {
	public static void main(String[] args) {
	    SpringApplication.run(ProviderUser2RunApp.class, args);
	  }

}
