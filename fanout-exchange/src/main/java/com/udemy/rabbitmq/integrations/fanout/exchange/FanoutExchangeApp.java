package com.udemy.rabbitmq.integrations.fanout.exchange;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author dbatista
 */
@SpringBootApplication
public class FanoutExchangeApp {

  public static void main(String... args) {
    SpringApplication.run(FanoutExchangeApp.class, args);
  }

}
