package com.sunshine.service.spring.cloud.alibaba.laboratory.taurus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Taurus启动器
 * @author sunshine
 * @created 2020-04-22
 */
@EnableDiscoveryClient
@SpringBootApplication
public class TaurusBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(TaurusBootstrap.class, args);
	}
}
