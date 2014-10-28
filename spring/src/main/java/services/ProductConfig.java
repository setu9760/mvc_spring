package services;

import org.springframework.context.annotation.Bean;

import domain.Product;

public class ProductConfig {

	@Bean(name = "product1")
	public Product product1() {
		return new Product("Product 1", 10.3);
	}

	@Bean(name = "product2")
	public Product product2() {
		return new Product("Product 2", 17.4);
	}

	@Bean(name = "product3")
	public Product product3() {
		return new Product("Product 3", 12.3);
	}

}
