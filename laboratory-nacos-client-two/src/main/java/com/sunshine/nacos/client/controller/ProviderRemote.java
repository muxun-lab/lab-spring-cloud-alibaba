package com.sunshine.nacos.client.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "laboratory-nacos-provider")
public interface ProviderRemote {

	@GetMapping("/nacos/client/one/config")
	String getConfig();
}
