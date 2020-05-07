package com.sunshine.service.spring.cloud.alibaba.laboratory.sagittarius;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author sunshine
 * @created 2020-04-25
 */
@EnableDiscoveryClient
@SpringBootApplication
public class SagittariusBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(SagittariusBootstrap.class, args);
	}
}
