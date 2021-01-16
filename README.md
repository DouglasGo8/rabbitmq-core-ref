# RabbitMQ System Integrations with Apache Camel

## (Apache Camel RabbitMQ Component)[https://camel.apache.org/components/latest/rabbitmq-component.html]
---

## RabbitMQ Docker windows 10 Pro
```
$ docker run -d --name rabbitmq --restart always --hostname docker-rabbitmq -p 5672:5672 -p 15672:15672 -v ~/.volumes/rabbitmq/data:/var/lib/rabbitmq/mnesia rabbitmq:management
```
## RabbitMQ Basic Concepts

1. Producer a kind of information as a Message
2. Consumer this kind of information
3. RabbitMQ is commonly used with Exchanges and Queues
4. Queue is a buffer that store messages
5. Exchange routing message to queue
6. Routing key is the key that the exchanges looks at to decide how to route the message
7. Binding link between exchange to queues
