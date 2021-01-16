package com.udemy.rabbitmq.integrations.hello.rabbitmq.component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class HelloRabbitMQConsumerRoute extends RouteBuilder {

  @Override
  public void configure() {
    from("{{rabbitmq.hello.producer.endpoint}}")
            .log("Consuming message -- ${body} - ${threadName} -- from RabbitMQ!" );
  }
}
