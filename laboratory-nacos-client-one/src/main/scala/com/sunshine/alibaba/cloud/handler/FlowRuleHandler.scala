package com.sunshine.alibaba.cloud.handler

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule
import com.sunshine.alibaba.cloud.jooq.laboratory.Tables.FLOW_RULE
import org.springframework.beans.factory.annotation.Autowired

import scala.collection.JavaConverters._


class FlowRuleHandler @Autowired() (dslContext: DefaultDSLContext) {

  @Autowired
  private val dslContextOne: DefaultDSLContext = null

  def getRule(): List[FlowRule] = {
    val flowRuleList: java.util.List[FlowRule] = dslContext.select()
      .from(FLOW_RULE)
        .fetch()
        .into(classOf[FlowRule])
    flowRuleList.asScala.toList
  }
}
