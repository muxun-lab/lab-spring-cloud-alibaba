package com.sunshine.nacos.client.controller;

import com.sunshine.nacos.client.configuration.JOOQContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Nacos客户端路由
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-03 16:48
 */
@RefreshScope
@RestController
@RequestMapping("/nacos/client/one")
public class NacosClientController {

	@Value("${nacos.client.test:'nacosClientTestDefault'}")
	private String nacosClientTest;
	@Value("${jdbc.url}")
	private String jdbcUrl;

	@Autowired
	private ApplicationContext applicationContext;

	@GetMapping("/config")
	public String getConfig() {
		return nacosClientTest;
	}

	@GetMapping("/datasource")
	public String switchDatasource() {
		JOOQContext jooqContext = applicationContext.getBean(JOOQContext.class);
		return jooqContext.getDslContext().select().from("user").fetch().toString();
	}

	@GetMapping("/jdbcUrl")
	public String getJDBCUrl() {
		return this.jdbcUrl;
	}
}
