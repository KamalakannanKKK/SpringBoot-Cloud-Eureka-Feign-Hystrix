package com.learning.SpringCloud.Consumer.Eureka.Feign.Fallback;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.learning.SpringCloud.Consumer.Eureka.Feign.Model.Product;
import com.learning.SpringCloud.Consumer.Eureka.Feign.Proxy.ProductServiceProxy;

@Service
public class Productservicefallback implements ProductServiceProxy{

	@Override
	public Product getProductById(Long id) {
		// TODO Auto-generated method stub
		return new Product(id,"phone","samsung",7.0);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		Product p=new Product(1L,"phone","samsung",7.0);
		Product p1=new Product(2L,"phone","samsung",7.0);
		return Arrays.asList(p,p1);
	}

	
}
