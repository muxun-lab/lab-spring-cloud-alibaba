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
  def sentinelOne(): String = {
    "Sunshine Spring Cloud Alibaba之Sentinel系列"
  }
}
