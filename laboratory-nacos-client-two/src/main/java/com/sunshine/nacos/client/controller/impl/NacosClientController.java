package com.sunshine.nacos.client.controller.impl;

import com.alibaba.fastjson.JSON;
import com.sunshine.nacos.client.controller.ProviderRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-03 20:53
 */
@RestController
@RequestMapping("/nacos/client/two")
public class NacosClientController {

	@Autowired
	private ProviderRemote providerRemote;
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/config")
	public String getConfigFromProvider(HttpServletRequest request, HttpServletResponse response) {
		return providerRemote.getConfig();
	}

	@GetMapping("/instance/{serviceId}")
	public String getServiceInstanceFromNacosServer(@PathVariable("serviceId") String serviceId) {
		return JSON.toJSONString(discoveryClient.getInstances(serviceId));
	}

	@GetMapping("/services")
	public String getServicesFromNacosServer() {
		return JSON.toJSONString(discoveryClient.getServices());
	}
}
