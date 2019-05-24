package com.sunshine.alibaba.cloud.service;

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sunshine.alibaba.cloud.jooq.laboratory.Tables.FLOW_RULE;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @since 2019-05-24
 */
@Service
public class FlowRuleHandler {

    @Autowired
    private DSLContext dslContext;

    public List<FlowRule> getRule() {
        return dslContext.select()
                .from(FLOW_RULE)
                .fetch()
                .into(FlowRule.class);
    }
}
