package com.realtime.trade.processor.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.realtime.trade.processor.dto.Order;

@Service
public class OrderService {
	
	@Autowired
	 private KafkaTemplate<String, Order> kafkaTemplate;

	 
	    public void placeOrder( Order order) {
	        // DB operation (store JSON or structured fields)
	        //jdbcTemplate.update("INSERT INTO orders (id, payload) VALUES (?, ?)",
	               // orderId, new ObjectMapper().writeValueAsString(order));

	        // Kafka operation (Order object auto‑serialized to JSON)
	    	System.out.println("Posting order to Kafka Broker:"+order);
	        kafkaTemplate.send("orders-topic", order.getOrderId().toString(), order);
	        System.out.println("Message posted to Kafka Broker:"+order);
	    }
}
