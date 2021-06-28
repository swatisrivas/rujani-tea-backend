package com.tea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.tea.models.Product;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer >{
	
	//@Query("from Product where type like :type ")
	List<Product> findByType( String type);

	
	@Query("from Product where type like :param OR category like :param")
	List<Product> findByCategoryOrType(String param);


	@Query("from Product")
	List<Product> findByCategory(String category);
}
