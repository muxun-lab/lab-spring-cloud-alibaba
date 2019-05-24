package com.sunshine.alibaba.cloud.configuration;

import com.alibaba.csp.sentinel.datasource.AutoRefreshDataSource;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.csp.sentinel.property.SentinelProperty;
import com.sunshine.alibaba.cloud.service.FlowRuleHandler;
import org.springframework.beans.factory.annotation.Autowired;

public class SunshineDataSource extends AutoRefreshDataSource {

	@Autowired
	private FlowRuleHandler flowRuleHandler;

	public SunshineDataSource(Converter configParser) {
		super(configParser);
	}

	public SunshineDataSource(Converter configParser, long recommendRefreshMs) {
		super(configParser, recommendRefreshMs);
	}

	@Override
	public Object loadConfig() throws Exception {
		return super.loadConfig();
	}

	@Override
	public Object loadConfig(Object conf) throws Exception {
		return super.loadConfig(conf);
	}

	@Override
	public SentinelProperty getProperty() {
		return super.getProperty();
	}

	@Override
	public void close() throws Exception {
		super.close();
	}

	@Override
	protected boolean isModified() {
		return super.isModified();
	}

	@Override
	public Object readSource() throws Exception {
		return flowRuleHandler.getRule();
	}
}
