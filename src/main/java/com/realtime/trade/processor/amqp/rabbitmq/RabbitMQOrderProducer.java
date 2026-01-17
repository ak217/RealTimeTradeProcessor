package com.realtime.trade.processor.amqp.rabbitmq;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQOrderProducer {
    private final RabbitTemplate rabbitTemplate;

    public RabbitMQOrderProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendOrder(String orderId) {
        rabbitTemplate.convertAndSend(
            "order.exchange",
            "order.created",
            orderId
        );
    }
}
