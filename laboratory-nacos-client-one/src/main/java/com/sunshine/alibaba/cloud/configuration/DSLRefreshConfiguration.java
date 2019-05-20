package com.sunshine.alibaba.cloud.configuration;

import com.sunshine.alibaba.cloud.event.RefreshEvent;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.ConnectionProvider;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-13 19:32
 */
@RefreshScope
@Component
public class DSLRefreshConfiguration {

	@Autowired
	private ApplicationContext applicationContext;

	private void refresh() {
		HikariDataSource hikariDataSource = new HikariDataSource();
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory)applicationContext.getAutowireCapableBeanFactory();
		GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
		OOMAutoConfiguration oomAutoConfiguration = applicationContext.getBean(OOMAutoConfiguration.class);
		hikariDataSource.setJdbcUrl(oomAutoConfiguration.getJdbcUrl());
		hikariDataSource.setUsername(oomAutoConfiguration.getJdbcUsername());
		hikariDataSource.setPassword(oomAutoConfiguration.getJdbcPassword());
		ConnectionProvider connectionProvider = new DataSourceConnectionProvider(hikariDataSource);
		org.jooq.Configuration configuration = new DefaultConfiguration();
		configuration.set(connectionProvider).set(SQLDialect.MYSQL);
		DSLContext dslContext = DSL.using(configuration);
		JOOQContext jooqContext = applicationContext.getBean(JOOQContext.class);
		jooqContext.setDslContext(dslContext);
		beanFactory.destroySingleton(dslContext.getClass().getName());
		beanDefinition.setBeanClassName(dslContext.getClass().getName());
		beanDefinition.setAutowireCandidate(true);
		beanFactory.registerBeanDefinition(dslContext.getClass().getName(), beanDefinition);
	}

	@EventListener(RefreshEvent.class)
	public void listener(RefreshEvent refreshEvent) {
		refresh();
	}
}
