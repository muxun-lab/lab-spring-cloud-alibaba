package com.sunshine.alibaba.cloud.config

import com.sunshine.alibaba.cloud.TemporaryConverter
import com.sunshine.alibaba.cloud.converter.JSonFlowRuleListConverter
import org.springframework.context.annotation.{Bean, Configuration}

/**
  * @author
  * @since
  */
@Configuration
class SentinelConverterConfiguration {

  @Bean
  def buildSentinelConverter(): JSonFlowRuleListConverter = {
    new JSonFlowRuleListConverter
  }
}
