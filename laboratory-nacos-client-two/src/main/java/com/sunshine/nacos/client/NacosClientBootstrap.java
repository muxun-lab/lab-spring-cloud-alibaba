package com.sunshine.nacos.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-03 20:46
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosClientBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(NacosClientBootstrap.class);
	}
}
