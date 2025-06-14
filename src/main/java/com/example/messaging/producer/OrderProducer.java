package com.example.messaging.producer;

import com.example.order.model.Order;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderProducer {
    @Autowired
    private RabbitTemplate mqTemplate;

    public static final String queue_name = "cake-order";
    public static final String exchange_name = "cakeFactory";
    public static final String routing_key = "routing-key";

    public void sendMessage(Order message) {
        mqTemplate.convertAndSend(exchange_name, routing_key, message);
    }
}
