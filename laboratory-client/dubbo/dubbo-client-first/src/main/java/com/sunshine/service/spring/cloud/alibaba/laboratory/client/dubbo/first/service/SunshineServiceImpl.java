package com.sunshine.service.spring.cloud.alibaba.laboratory.client.dubbo.first.service;

import com.sunshine.service.spring.cloud.alibaba.laboratory.dubbo.api.service.SunshineService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Dubbo Sunshine服务实现
 * @author sunshine
 * @created 2019-09-17
 */
@Service
public class SunshineServiceImpl implements SunshineService {

	@Override
	public String shine() {
		return "Sunshine Dubbo Service";
	}
}
