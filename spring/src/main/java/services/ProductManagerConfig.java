package services;

import org.springframework.context.annotation.Bean;

import domain.*;

public class ProductManagerConfig {
	@Bean(name ="productManager")
	public Productmanager manager() {
		return new SimpleProductManager();
	}
}
