package com.udemy.rabbitmq.integrations.hello.rabbitmq.component;


import com.udemy.rabbitmq.integrations.hello.rabbitmq.service.EmployeeFactory;
import org.apache.camel.builder.RouteBuilder;

import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;


@Component
public class HelloRabbitMQProducerRoute extends RouteBuilder {

  @Override
  public void configure() {

    from("timer://myTimer?period=10s&fixedRate=true")
            //.transform(constant("RabbitMQ and Camel Rocks!!!"))
            .bean(EmployeeFactory::new)
            .marshal().json(JsonLibrary.Jackson)
            //.log("${body}")
            .to("{{rabbitmq.hello.producer.endpoint}}");
  }
}
