package com.sunshine.service.spring.cloud.alibaba.laboratory.sagittarius.rpc;

import com.sunshine.service.dubbo.service.ExperimentService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Sagittarius RPC服务
 * @author sunshine
 * @created 2020-04-25
 */
@Service(version = "1.0.0", protocol = "dubbo")
public class SagittariusRPCService implements ExperimentService {

	@Override
	public String experiment() {
		return "Sagittarius Laboratory";
	}
}
