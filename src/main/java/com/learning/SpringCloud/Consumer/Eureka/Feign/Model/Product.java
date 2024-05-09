package com.learning.SpringCloud.Consumer.Eureka.Feign.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private Long id;
	
	private String name;
	
	private String brand;
	
	private double price;
}
