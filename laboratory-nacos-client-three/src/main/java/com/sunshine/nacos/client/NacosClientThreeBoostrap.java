package com.sunshine.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-11 18:42
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientThreeBoostrap {

	public static void main(String[] args) {
		SpringApplication.run(NacosClientThreeBoostrap.class);
	}
}
