package com.sunshine.alibaba.cloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sunshine.alibaba.cloud.configuration.JOOQContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nacos客户端路由
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-03 16:48
 */
@RestController
@RequestMapping("/nacos/client/one")
public class NacosClientController {

	private String nacosClientTest;

	private String jdbcUrl;

	@Autowired
	private ApplicationContext applicationContext;

	@GetMapping("/config")
	public String getConfig() {
		return nacosClientTest;
	}

	@GetMapping("/datasource")
	@SentinelResource()
	public String switchDatasource() {
		JOOQContext jooqContext = applicationContext.getBean(JOOQContext.class);
		return jooqContext.getDslContext().select().from("user").fetch().toString();
	}

	@GetMapping("/jdbcUrl")
	public String getJDBCUrl() {
		return this.jdbcUrl;
	}
}
