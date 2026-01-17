package com.realtime.trade.processor.amqp.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class RabbitMQOrderConsumerService {
	@RabbitListener(queues = "order.queue")
	public void processOrder(String orderId) {
	    System.out.println("Sending email for order: " + orderId);
	}
}
