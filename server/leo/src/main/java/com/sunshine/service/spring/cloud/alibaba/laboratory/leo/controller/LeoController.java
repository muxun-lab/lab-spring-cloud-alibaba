package com.sunshine.service.spring.cloud.alibaba.laboratory.leo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Leo控制器
 * @author sunshine
 * @created 2020-04-25
 */
@RestController
@RequestMapping("/laboratory/leo")
public class LeoController {

	@PostMapping("/experiment")
	public String experiment() {
		return "Leo Laboratory";
	}
}
