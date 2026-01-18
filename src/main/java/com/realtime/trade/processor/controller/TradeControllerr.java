package com.realtime.trade.processor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/trade_api")
public class TradeControllerr {
	
    @GetMapping("/td_msg")
    public String greeting( ) {
    	
    	
      System.out.println("Count:");
      return "HELLO world! "+ " Welcome to India" +"  Core Java, Java 17, Java 21, Java Streams, Java Concurrency, Java Async and non-blocking Programming, Completable Future, Spring Boot, Hibernate, Java Project Reactor, Spring WebFlux, XML, maven, Design patterns, SOLID Principles,  Redis , MongoDB, Kafka, RabbitMQ, git, event-driven microservices, Docker, k8s, AWS, Gen AI GitHub Copilot, Jenkins, JIRA KAN BAN";
    }

}
