package com.sunshine.service.spring.cloud.alibaba.laboratory.client.dubbo.second;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Dubbo第二客户端启动器
 * @author sunshine
 * @created 2019-09-17
 */
@EnableDiscoveryClient
@SpringBootApplication
public class DubboClientSecondBootstrap {

	public static void main(String[] args) {
		SpringApplication.run(DubboClientSecondBootstrap.class, args);
	}
}
