package com.learning.SpringCloud.Consumer.Eureka.Feign.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.learning.SpringCloud.Consumer.Eureka.Feign.Model.Product;
import com.learning.SpringCloud.Consumer.Eureka.Feign.Proxy.ProductServiceProxy;

@RestController
@Scope("request")
public class ProductController {

	@Autowired
	private ProductServiceProxy productServiceProxy;
	
	@GetMapping("get-products/{id}")
	public Product getProductById(@PathVariable Long id) {
		Product product=productServiceProxy.getProductById(id);
		return product;
	}
	
	@GetMapping("get-products")
	public List<Product> getAllProduct() {
		List<Product> product=productServiceProxy.getAllProducts();
		return product;
	}
}
