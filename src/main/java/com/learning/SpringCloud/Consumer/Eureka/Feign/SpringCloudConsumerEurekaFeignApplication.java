package com.learning.SpringCloud.Consumer.Eureka.Feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableHystrixDashboard
@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
public class SpringCloudConsumerEurekaFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerEurekaFeignApplication.class, args);
	}

}
