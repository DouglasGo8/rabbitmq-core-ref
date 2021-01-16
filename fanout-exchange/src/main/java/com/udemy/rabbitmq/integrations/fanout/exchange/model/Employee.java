package com.udemy.rabbitmq.integrations.fanout.exchange.model;


import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@AllArgsConstructor
public class Employee implements Serializable {
  private final String name;
  private final String address;
  private final LocalDate hireDate;
}
