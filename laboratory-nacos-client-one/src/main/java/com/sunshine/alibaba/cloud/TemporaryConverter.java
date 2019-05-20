package com.sunshine.alibaba.cloud;

import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import java.util.List;

/**
 * @author <yangsonglin> mysunshinedreams@163.com
 * @since 2019-05-20 21:02
 */
public class TemporaryConverter implements Converter<String, List<FlowRule>> {

	@Override
	public List<FlowRule> convert(String source) {
		return JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
		});
	}
}
