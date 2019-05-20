package com.sunshine.alibaba.cloud.converter

import com.alibaba.csp.sentinel.datasource.Converter
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule
import net.liftweb.json._
import net.liftweb.json.Serialization.{read, write}

/**
  * @author <sunshine> mysunshinedreams@163.com
  * @since
  */
class JSonFlowRuleListConverter extends Converter[String, List[FlowRule]]{

  override def convert(source: String): List[FlowRule] = {
    read[List[FlowRule]](source)(DefaultFormats, manifest[List[FlowRule]])
  }
}
