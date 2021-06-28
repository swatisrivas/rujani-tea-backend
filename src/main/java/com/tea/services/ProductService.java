package com.tea.services;

import java.util.List;
import java.util.Optional;

import com.tea.exceptions.ProductNotFoundException;
import com.tea.models.Product;



public interface ProductService {
	
	
	List<Product> getAll() throws ProductNotFoundException;
	List<Product> getByCategory(String category) throws ProductNotFoundException;
	Optional<Product> getById(int id) throws ProductNotFoundException;
	List<Product> getByCategoryOrType(String param) throws ProductNotFoundException;
}

