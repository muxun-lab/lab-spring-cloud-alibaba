package com.sunshine.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-03 16:41
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosClientOneBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(NacosClientOneBootstrap.class);
	}
}
