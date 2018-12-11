package com.sunshine.nacos.client.controller;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-03 20:53
 */
@RestController
@RequestMapping("/nacos/client/two")
public class NacosClientController {

	@LoadBalanced
	private RestTemplate restTemplate = new RestTemplate();

	@GetMapping("/config")
	public String getConfigFromProvider(HttpServletRequest request, HttpServletResponse response) {
//		return restTemplate.getForObject("http://laboratory-nacos-provider/nacos/client/one", String.class);
		return "!";
	}
}
