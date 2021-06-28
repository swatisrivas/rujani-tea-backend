package com.tea;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.tea.services.ProductService;

@SpringBootApplication
public class RujaniTeaApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RujaniTeaApplication.class, args);
	}

	@Autowired
	ProductService productService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		productService.getAll();
		
	}
	
	

}
