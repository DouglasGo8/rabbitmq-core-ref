package com.udemy.rabbitmq.integrations.direct.exchange.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author dbatista
 */
@Getter
@AllArgsConstructor
public class Image {

  private final String name;
  private final String type;
  private final String source;

  private final long size;
    
}
