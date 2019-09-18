package com.sunshine.alibaba.cloud.service.impl

import com.alibaba.csp.sentinel.slots.block.BlockException
import com.alibaba.csp.sentinel.{AsyncEntry, Entry, SphO, SphU}
import com.sunshine.alibaba.cloud.service.ISentinelService
import org.springframework.stereotype.Service

/**
 * Sentinel服务实现
 * @author <sunshine> mysunshinedreams@163.com
 * @since 2019-06-13
 */
@Service("sentinelService")
class SentinelServiceImpl extends ISentinelService {

  override def buildSphU(): Unit = {
    var entry: Entry = null
    try {
      entry = SphU.entry("sentinelOne")
    } catch {
      case e: BlockException => throw new Exception("sentinelOne已经被限流")
      case e: Exception => println(e.printStackTrace())
    } finally {
      if (entry != null) {
        entry.exit()
      }
    }
  }

  override def buildSphO(): Unit = {
    if (SphO.entry("sentinelTwo")) {
      try {
        println("sentinelTwo资源获取")
      } finally {
        SphO.exit()
      }
    } else {
      println("sentinelTwo资源被流控")
    }
  }

  override def buildAsyncSphU(): Unit = {
    try {
      val asyncEntry: AsyncEntry = SphU.asyncEntry("sentinelThree")

      asyncEntry.exit()
    } catch {
      case e: BlockException => throw new Exception("sentinelThree资源获取阻塞")
      case e: Exception => println(e.printStackTrace())
    }
  }
}
