package com.udemy.rabbitmq.integrations.hello.rabbitmq.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
@AllArgsConstructor
public class Employee implements Serializable {
  private final String name;
  private final String address;
}
