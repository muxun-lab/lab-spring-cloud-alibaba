package com.sunshine.service.spring.cloud.alibaba.laboratory.client.dubbo.second.controller;

import com.sunshine.service.spring.cloud.alibaba.laboratory.dubbo.api.service.SunshineService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Dubbo第二客户端控制器
 * @author sunshine
 * @created 2019-09-17
 */
@RestController
@RequestMapping("/client/dubbo/second")
public class DubboClientSecondController {

	@Reference(check = false)
	private SunshineService sunshineService;

	@GetMapping("/shine")
	public String shine() {
		return sunshineService.shine();
	}
}
