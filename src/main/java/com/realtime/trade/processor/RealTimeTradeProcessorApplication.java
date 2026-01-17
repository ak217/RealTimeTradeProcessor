package com.realtime.trade.processor;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RealTimeTradeProcessorApplication {

	public static void main(String[] args) {
		SpringApplication.run(RealTimeTradeProcessorApplication.class, args);
	}

}
