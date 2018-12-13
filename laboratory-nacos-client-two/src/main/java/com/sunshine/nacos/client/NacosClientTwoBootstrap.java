package com.sunshine.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-03 20:46
 */
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class NacosClientTwoBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(NacosClientTwoBootstrap.class);
	}
}
