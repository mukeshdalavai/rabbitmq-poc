package com.stackroute.service;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.stackroute.model.Employee;
@Service
public class RabbitMqService {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Value("${javainuse.rabbitmq.exchange}")
    private String exchange;

    @Value("${javainuse.rabbitmq.routingkey}")
    private String routingkey;

    public void send(Employee employee) {
        System.out.println("inside send" + employee.getEmpName());
        rabbitTemplate.convertAndSend(exchange, routingkey,employee);
        System.out.println("Send msg = " + employee);
    }
}
