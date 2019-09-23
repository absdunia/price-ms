package com.eCommerce.price;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsPriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPriceApplication.class, args);
	}
}
