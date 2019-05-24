package com.sunshine.alibaba.cloud.config

import com.zaxxer.hikari.HikariDataSource
import org.springframework.boot.autoconfigure.jdbc.{DataSourceAutoConfiguration, DataSourceProperties}
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.context.annotation.{Bean, Configuration}

@Configuration
@RefreshScope
class HikariDataSourceConfiguration extends DataSourceAutoConfiguration{

  @Bean
  @ConfigurationProperties(prefix = "spring.datasource")
  def buildHikariDataSource(dataSourceProperties: DataSourceProperties): HikariDataSource = {
    val hikariDataSource = new HikariDataSource
    hikariDataSource.setJdbcUrl(dataSourceProperties.determineUrl())
    hikariDataSource.setUsername(dataSourceProperties.determineUsername())
    hikariDataSource.setPassword(dataSourceProperties.determinePassword())
    hikariDataSource
  }
}
