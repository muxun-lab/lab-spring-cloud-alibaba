package com.sunshine.discovery.client.configuration;

import com.sunshine.discovery.client.conditional.ConditionalOnSunshineDiscoveryEnabled;
import com.sunshine.discovery.client.registry.SunshineDiscoveryClient;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 服务发现自动配置
 *
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-11 20:50
 */
@Configuration
@EnableConfigurationProperties
@ConditionalOnSunshineDiscoveryEnabled
@ConditionalOnMissingBean(DiscoveryClient.class)
public class SunshineDiscoveryClientAutoConfiguration {

	@Bean
	public DiscoveryClient initSunshineDiscoveryClient() {
		return new SunshineDiscoveryClient();
	}
}
