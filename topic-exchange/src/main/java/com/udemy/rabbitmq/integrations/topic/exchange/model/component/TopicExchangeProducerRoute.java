package com.udemy.rabbitmq.integrations.topic.exchange.model.component;

import com.udemy.rabbitmq.integrations.topic.exchange.model.service.ImageFactory;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

/**
 * @author dbatista
 */
@Component
public class TopicExchangeProducerRoute extends RouteBuilder {
  @Override
  public void configure() {
    final var rabbitMQEndpoint = "rabbitmq:x.picture2?addresses=localhost" +
            "&exchangeType=topic&routingKey=${exchangeProperty.routingKey}" +
            "&autoDelete=false&skipQueueDeclare=true";

    from("timer://picTimer?period=3s&fixedRate=true").autoStartup(false)
            .bean(ImageFactory::new)
            .setProperty("routingKey", simple("${body.type}"))
            .marshal().json(JsonLibrary.Jackson)
            //.log("${exchangeProperty.routingKey}")
            .toD(rabbitMQEndpoint);
  }
}
