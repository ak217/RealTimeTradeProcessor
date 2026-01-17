package com.realtime.trade.processor.dto;

import org.springframework.kafka.support.serializer.JsonSerializer;
//import org.apache.kafka.common.serialization.JsonSerializer;
import org.springframework.kafka.support.serializer.JsonDeserializer;
public class Order {

	Integer orderId;
	String name;
	Double orderAmount;
	
	public Order() {
		
	}
			
	public Order(Integer orderId,String name,Double orderAmount) {
		this.orderId=orderId;
		this.name=name;
		this.orderAmount=orderAmount;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public String getName() {
		return name;
	}

	public Double getOrderAmount() {
		return orderAmount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", name=" + name + ", orderAmount=" + orderAmount + "]";
	}
}
