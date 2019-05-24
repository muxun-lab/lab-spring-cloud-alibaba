package com.sunshine.alibaba.cloud.configuration;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.sunshine.alibaba.cloud.converter.JSonFlowRuleListConverter;
import org.springframework.cloud.alibaba.sentinel.datasource.converter.JsonConverter;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @since 2019-05-24
 */
public class SunshineInitFunc implements InitFunc {

    @Override
    public void init() throws Exception {
        ReadableDataSource sunshineDataSource = new SunshineDataSource(new JSonFlowRuleListConverter());
        FlowRuleManager.register2Property(sunshineDataSource.getProperty());
    }
}
