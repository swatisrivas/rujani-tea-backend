package com.tea.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tea.exceptions.ProductNotFoundException;
import com.tea.models.Product;
import com.tea.services.ProductService;

@CrossOrigin("http://localhost:4200")
@RestController
public class ProductController {
	@Autowired
	ProductService productService;
	
	@GetMapping("/get-all-teas")
	List<Product> getAll() throws ProductNotFoundException{
		return productService.getAll();
	}
	
	@GetMapping("/teas-by-category/{category}")
	List<Product> getByCategory(@PathVariable("category") String category) throws ProductNotFoundException{
		return productService.getByCategory(category);
	}
	
	@GetMapping("/tea-by-id/{id}")
	Optional<Product> getById(@PathVariable("id") int id) throws ProductNotFoundException{
		return productService.getById(id);
	}
	
	@GetMapping("/teas-by-category-or-type/{param}")
	List<Product> getByCategoryAndType(@PathVariable("param") String param) throws ProductNotFoundException{
		return productService.getByCategoryOrType(param);
	}
}
