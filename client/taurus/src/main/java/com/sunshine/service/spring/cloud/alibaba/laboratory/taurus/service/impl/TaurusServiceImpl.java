package com.sunshine.service.spring.cloud.alibaba.laboratory.taurus.service.impl;

import com.sunshine.service.dubbo.service.ExperimentService;
import com.sunshine.service.spring.cloud.alibaba.laboratory.taurus.service.TaurusService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * Taurus通用服务实现
 * @author sunshine
 * @created 2020-04-25
 */
@Service("taurusService")
public class TaurusServiceImpl implements TaurusService {

	@Reference(version = "1.0.0", protocol = "dubbo", loadbalance = "roundrobin")
	private ExperimentService experimentService;

	@Override
	public String experiment() {
		return experimentService.experiment();
	}
}
