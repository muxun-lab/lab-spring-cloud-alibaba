package com.sunshine.service.spring.cloud.alibaba.laboratory.taurus.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.sunshine.service.spring.cloud.alibaba.laboratory.taurus.service.TaurusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Taurus控制器
 * @author sunshine
 * @created 2020-04-25
 */
@RestController
@RequestMapping("/laboratory/taurus")
public class TaurusController {

	@Autowired
	public TaurusController(TaurusService taurusService) {
		this.taurusService = taurusService;
	}

	/**
	 * Taurus通用服务
	 */
	private final TaurusService taurusService;

	@PostMapping("/experiment")
	public String experiment() {
		return taurusService.experiment();
	}
}
