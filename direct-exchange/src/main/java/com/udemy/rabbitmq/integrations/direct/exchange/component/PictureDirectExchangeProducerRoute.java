package com.udemy.rabbitmq.integrations.direct.exchange.component;

import com.udemy.rabbitmq.integrations.direct.exchange.service.ImageFactory;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;
import org.springframework.stereotype.Component;

@Component
public class PictureDirectExchangeProducerRoute extends RouteBuilder {

  @Override
  public void configure() throws Exception {


    var rabbitMQEndpoint = "rabbitmq:x.picture?addresses=localhost" +
            "&exchangeType=direct&routingKey=${exchangeProperty.type}" +
            "&autoDelete=false&skipQueueDeclare=true";

    from("timer://picTimer?period=3s&fixedRate=true")
            .bean(ImageFactory::new)
            .setProperty("type", simple("${body.type}"))
            .marshal().json(JsonLibrary.Jackson)
            //.log("${exchangeProperty.type}")
            .toD(rabbitMQEndpoint);

  }
}
