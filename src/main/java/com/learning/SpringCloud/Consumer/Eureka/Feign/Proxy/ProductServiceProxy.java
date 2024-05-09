package com.learning.SpringCloud.Consumer.Eureka.Feign.Proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.learning.SpringCloud.Consumer.Eureka.Feign.Fallback.Productservicefallback;
import com.learning.SpringCloud.Consumer.Eureka.Feign.Model.Product;

@FeignClient(name="product-service", fallback=Productservicefallback.class)
public interface ProductServiceProxy {
 
	@GetMapping(value="/Product/{id}",produces= {
			MediaType.APPLICATION_JSON_VALUE
	})
	public Product getProductById(@PathVariable Long id);
	
	
	@GetMapping(value="/Product",produces= {
			MediaType.APPLICATION_JSON_VALUE
	})
	public List<Product> getAllProducts();
}
