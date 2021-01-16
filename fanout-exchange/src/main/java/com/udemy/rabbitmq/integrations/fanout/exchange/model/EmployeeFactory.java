package com.udemy.rabbitmq.integrations.fanout.exchange.model;

import org.apache.camel.Handler;

import java.time.LocalDate;

public class EmployeeFactory {

  @Handler
  public Employee madeEmployee() {
    return new Employee("Ketty", "Street 10 Av Fifth", LocalDate.now());
  }
}
