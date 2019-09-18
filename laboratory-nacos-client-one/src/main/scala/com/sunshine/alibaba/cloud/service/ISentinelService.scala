package com.sunshine.alibaba.cloud.service

/**
 * Sentinel服务接口
 * @author <sunshine> mysunshinedreams@163.com
 * @since 2019-06-13
 */
trait ISentinelService {

  /**
   * SphU使用
   */
  def buildSphU()

  /**
   * SphO使用
   */
  def buildSphO()

  /**
   * 异步SphU使用
   */
  def buildAsyncSphU()
}
