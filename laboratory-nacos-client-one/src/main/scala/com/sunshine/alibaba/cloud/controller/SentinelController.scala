package com.sunshine.alibaba.cloud.controller

import com.alibaba.csp.sentinel.annotation.SentinelResource
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

/**
  * @author <sunshine> mysunshinedreams@163.com
  * @since
  */
@RestController
@RequestMapping(value = Array("/alibaba/cloud/one"))
class SentinelController {

  @SentinelResource(value = "sentinelTest")
  @GetMapping(Array("/sentinel/one"))
  def buildSentinelOne(): String = {
    "Sunshine Spring Cloud Alibaba之Sentinel系列"
  }

  @GetMapping(Array("/sentinel/two"))
  def buildSentinelTwo(): String = {
    ""
  }
}
