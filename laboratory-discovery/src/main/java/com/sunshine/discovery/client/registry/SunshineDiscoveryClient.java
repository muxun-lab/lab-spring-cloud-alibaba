package com.sunshine.discovery.client.registry;

import com.sunshine.commons.constant.SunshineDiscoveryConstants;
import com.sunshine.discovery.client.attribute.SunshineDiscoveryProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;

import java.util.List;

/**
 * Sunshine服务发现客户端
 *
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-11 21:03
 */
public class SunshineDiscoveryClient implements DiscoveryClient {

	@Autowired
	private SunshineDiscoveryProperties sunshineDiscoveryProperties;

	@Override
	public String description() {
		return SunshineDiscoveryConstants.DISCOVERY_CLIENT_DESCRIPTION;
	}

	@Override
	public List<ServiceInstance> getInstances(String serviceId) {

		return null;
	}

	@Override
	public List<String> getServices() {
		return null;
	}
}
