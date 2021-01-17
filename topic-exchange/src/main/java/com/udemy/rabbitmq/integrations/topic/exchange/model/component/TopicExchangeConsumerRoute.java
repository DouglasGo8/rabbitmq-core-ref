package com.udemy.rabbitmq.integrations.topic.exchange.model.component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class TopicExchangeConsumerRoute extends RouteBuilder {
  @Override
  public void configure() {

    from("{{rabbitmq.topic.queue.image.consumer}}")
            .log("Message from Picture of consumer ${threadName} with ${body}");

    from("{{rabbitmq.topic.queue.vector.consumer}}")
            .log("Message from Vector of consumer ${threadName} with ${body}");

    from("{{rabbitmq.topic.queue.filter.consumer}}")
            .log("Message from Filter of consumer ${threadName} with ${body}");

    from("{{rabbitmq.topic.queue.log.consumer}}")
            .log("Message from Log of consumer ${threadName} with ${body}");
  }
}
