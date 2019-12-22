package com.ui.getservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.ui.getservices")
public class GetServicesUserInterfaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GetServicesUserInterfaceApplication.class, args);
	}

}
