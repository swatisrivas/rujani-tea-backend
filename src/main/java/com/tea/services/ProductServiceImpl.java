package com.tea.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tea.exceptions.ProductNotFoundException;
import com.tea.models.Product;
import com.tea.repository.ProductRepository;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepository productRepository;

	

	@Override
	public List<Product> getAll() throws ProductNotFoundException {
		return productRepository.findAll();
	}

	@Override
	public List<Product> getByCategory(String category) throws ProductNotFoundException {
		List<Product> productList = productRepository.findByCategory(category);
		System.out.println(productList);
		if(productList==null) {
			throw new ProductNotFoundException("Product with this type not found");
		}
		return productList;
	}

	@Override
	public Optional<Product> getById(int id) throws ProductNotFoundException {
		Optional<Product> productList = productRepository.findById(id);
		if(productList==null) {
			throw new ProductNotFoundException("Product with this type not found");
		}
		return productList;
	}

	

	@Override
	public List<Product> getByCategoryOrType(String param) throws ProductNotFoundException {
		List<Product> productList = productRepository.findByCategoryOrType(param);
		if(productList==null) {
			throw new ProductNotFoundException("Product with this type not found");
		}
		return productList;}

	}


