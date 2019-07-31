package com.stackroute;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
public class SpringRabbiMqtListenerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringRabbiMqtListenerApplication.class,args);
    }
}
