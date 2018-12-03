package com.sunshine.nacos.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nacos客户端路由
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-03 16:48
 */
@RefreshScope
@RestController
@RequestMapping("/nacos/client/one")
public class NacosClientController {

	@Value("${nacos.client.test}")
	public String nacosClientTest;

	@GetMapping("/config")
	public String getConfig() {
		return nacosClientTest;
	}
}
