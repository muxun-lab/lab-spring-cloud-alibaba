package com.sunshine.alibaba.cloud.handler

import com.alibaba.csp.sentinel.slots.block.flow.FlowRule
import org.jooq.impl.DefaultDSLContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import com.sunshine.alibaba.cloud.jooq.laboratory.Tables.FLOW_RULE
import scala.collection.JavaConverters._


@Service
abstract class FlowRuleHandler {

  @Autowired
  var dslContext: DefaultDSLContext

  def getRule(): List[FlowRule] = {
    val flowRuleList: java.util.List[FlowRule] = dslContext.select()
      .from(FLOW_RULE)
        .fetch()
        .into(classOf[FlowRule])
    flowRuleList.asScala.toList
  }
}
