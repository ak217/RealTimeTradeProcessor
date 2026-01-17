package com.realtime.trade.processor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.realtime.trade.processor.amqp.rabbitmq.RabbitMQOrderProducer;
import com.realtime.trade.processor.dto.BookDTO;
import com.realtime.trade.processor.dto.Order;
import com.realtime.trade.processor.service.OrderService;
@RestController
@RequestMapping("/api")
@Validated
public class HomeController {
	  
	    static int count=0;

	    @Autowired
	    OrderService orderService;
	    @Autowired
	    RabbitMQOrderProducer rabbitMQOrderProducer;
	    
	    @GetMapping("/msg")
	    public String greeting( ) {
	    	/*Order order=new Order(452345,"OAK17",56785.3453);
	    	orderService.placeOrder(order); */
	    	rabbitMQOrderProducer.sendOrder("ZXS123434345667");
	      System.out.println("Count:"+(++count));
	      return "HELLO world! "+ " Welcome to India" +"  Core Java, Java 17, Java 21, Java Streams, Java Concurrency, Java Async and non-blocking Programming, Completable Future, Spring Boot, Hibernate, Java Project Reactor, Spring WebFlux, XML, maven, Design patterns, SOLID Principles,  Redis , MongoDB, Kafka, RabbitMQ, git, event-driven microservices, Docker, k8s, AWS, Gen AI GitHub Copilot, Jenkins, JIRA KAN BAN";
	    }
	    
	    @PostMapping("/create")
	    public ResponseEntity<String> createBoo(@RequestBody BookDTO bookDto  ) {
	      System.out.println("Creating book with details:"+bookDto);
	      return  new ResponseEntity<String>("Book created",  HttpStatus.CREATED);

	    }
	    
}
//http://localhost:8093/api/msg
// http://localhost:8093/api/hello
//http://localhost:8093/api/create
/* Test data
 
 
{
  "title": "Spring Boot event-driven microservices",
  "author": "Moisés Macero García",
  "price": 57545.4572
} 


 * 
 */


