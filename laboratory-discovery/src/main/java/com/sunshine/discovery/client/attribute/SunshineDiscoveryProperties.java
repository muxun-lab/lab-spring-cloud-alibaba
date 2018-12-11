package com.sunshine.discovery.client.attribute;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

/**
 * Sunshine服务发现属性配置
 * @author <sunshine> yangsonglin@maoyan.com
 * @date 2018-12-11 21:08
 */
@ConfigurationProperties("spring.cloud.sunshine.discovery")
public class SunshineDiscoveryProperties {

	@Autowired
	private Environment environment;

	/**
	 * 注册地址
	 */
	private String registryAddress;
	/**
	 * 命名空间
	 */
	private String namespace;
	/**
	 * 集群名称
	 */
	private String clusterName;

	@PostConstruct
	public void init() {
		this.initProperties();
	}

	public String getRegistryAddress() {
		return registryAddress;
	}

	public void setRegistryAddress(String registryAddress) {
		this.registryAddress = registryAddress;
	}

	public String getNamespace() {
		return namespace;
	}

	public void setNamespace(String namespace) {
		this.namespace = namespace;
	}

	public String getClusterName() {
		return clusterName;
	}

	public void setClusterName(String clusterName) {
		this.clusterName = clusterName;
	}

	/**
	 * 初始化参数
	 */
	private void initProperties() {
		if (StringUtils.isBlank(this.getRegistryAddress())) {
			this.setRegistryAddress(this.environment.resolvePlaceholders("${spring.cloud.sunshine.discovery.registry-address}"));
		}
		if (StringUtils.isBlank(this.getNamespace())) {
			this.setNamespace(this.environment.resolvePlaceholders("${spring.cloud.sunshine.discovery.namespace}"));
		}
		if (StringUtils.isBlank(this.getClusterName())) {
			this.setClusterName(this.environment.resolvePlaceholders("${spring.cloud.sunshine.discovery.cluster-name}"));
		}
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
