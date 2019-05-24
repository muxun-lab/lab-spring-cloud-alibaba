package com.sunshine.alibaba.cloud.handler

import java.beans.BeanProperty

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule
import com.sunshine.alibaba.cloud.jooq.laboratory.Tables.FLOW_RULE
import org.jooq.impl.DefaultDSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

import scala.collection.JavaConverters._


@Service
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
