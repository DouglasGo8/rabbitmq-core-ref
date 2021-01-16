package com.udemy.rabbitmq.integrations.hello.rabbitmq.service;

import com.udemy.rabbitmq.integrations.hello.rabbitmq.model.Employee;
import org.apache.camel.Handler;

public class EmployeeFactory {

  @Handler
  public Employee madeAnEmployee() {
    return new Employee("Douglas", "Street One Av: Watson");
  }
}
