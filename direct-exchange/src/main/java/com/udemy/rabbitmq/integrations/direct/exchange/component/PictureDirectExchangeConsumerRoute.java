package com.udemy.rabbitmq.integrations.direct.exchange.component;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class PictureDirectExchangeConsumerRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {

    from("{{rabbitmq.direct.queue.image.consumer}}")
            .log("Message from Picture of consumer ${threadName} with ${body}");

    from("{{rabbitmq.direct.queue.vector.consumer}}")
            .log("Message from Vector of consumer ${threadName} with ${body}");

  }
}
