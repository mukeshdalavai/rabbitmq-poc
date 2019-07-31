package com.stackroute.service;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.stackroute.model.Employee;

@Component
@RabbitListener(queues = "${javainuse.rabbitmq.queue}")
public class RabbitMqServiceConsumer {

    @RabbitHandler
    public void recievedMessage(Employee employee) {
        System.out.println("Recieved Message From RabbitMQ: " + employee);
    }
}
