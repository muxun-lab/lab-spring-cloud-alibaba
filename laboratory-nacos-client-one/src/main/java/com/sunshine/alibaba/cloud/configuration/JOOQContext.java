package com.sunshine.alibaba.cloud.configuration;

import org.jooq.DSLContext;
import org.springframework.stereotype.Component;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-13 21:31
 */
@Component
public class JOOQContext {

	private DSLContext dslContext;

	public DSLContext getDslContext() {
		return dslContext;
	}

	public void setDslContext(DSLContext dslContext) {
		this.dslContext = dslContext;
	}
}
