package com.sunshine.service.spring.cloud.alibaba.laboratory.leo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunshine
 * @created 2020-04-25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class LeoBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(LeoBootstrap.class, args);
	}
}
