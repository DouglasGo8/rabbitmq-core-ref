package com.udemy.rabbitmq.integrations.fanout.exchange.component;

import com.udemy.rabbitmq.integrations.fanout.exchange.model.EmployeeFactory;
import org.apache.camel.builder.RouteBuilder;

public class HumanResourceProducerRoute extends RouteBuilder {

  @Override
  public void configure() {

    from("timer://hrTimer?period=10s&fixedRate=true")
            .transform(method(EmployeeFactory.class))
            .log("${body}");
  }
}
