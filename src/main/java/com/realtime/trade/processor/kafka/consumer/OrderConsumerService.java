package com.realtime.trade.processor.kafka.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

import com.realtime.trade.processor.dto.Order;

@Service
public class OrderConsumerService {
         
	     @KafkaListener(topics = "orders-topic", groupId = "order-consumer-group")
       	 public void consume(Order order) {
        try {
            // Process order (e.g., save to DB)
            System.out.println("Received Order: " + order);
            // Commit offset only after successful processing
            
        } catch (Exception e) {
            // Offset not committed → message retried
        	System.out.println("Exception in OrderConsumerService.consume :"+e);
        }
    }
}
