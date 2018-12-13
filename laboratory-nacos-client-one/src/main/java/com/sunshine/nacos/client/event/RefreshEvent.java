package com.sunshine.nacos.client.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author <sunshine> mysunshinedreams@163.com
 * @date 2018-12-13 20:25
 */
public class RefreshEvent extends ApplicationEvent {

	private String jdbcUrl;

	private String username;

	private String password;

	public RefreshEvent(Object source, String jdbcUrl, String username, String password) {
		super(source);
		this.jdbcUrl = jdbcUrl;
		this.username = username;
		this.password = password;
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
