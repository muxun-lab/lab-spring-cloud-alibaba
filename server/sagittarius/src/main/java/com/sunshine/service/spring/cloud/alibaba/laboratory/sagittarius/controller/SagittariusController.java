package com.sunshine.service.spring.cloud.alibaba.laboratory.sagittarius.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Sagittarius控制器
 * @author sunshine
 * @created 2020-04-25
 */
@RestController
@RequestMapping("/laboratory/sagittarius")
public class SagittariusController {

	@PostMapping("/experiment")
	public String experiment() {
		return "Sagittarius Laboratory";
	}
}
