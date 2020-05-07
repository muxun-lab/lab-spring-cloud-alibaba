package com.sunshine.service.spring.cloud.alibaba.laboratory.leo.rpc;

import com.sunshine.service.dubbo.service.ExperimentService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Leo RPC服务
 * @author sunshine
 * @created 2020-04-25
 */
@Service(version = "1.0.0", protocol = "dubbo")
public class LeoRPCService implements ExperimentService {

	@Override
	public String experiment() {
		return "Leo Laboratory";
	}
}
