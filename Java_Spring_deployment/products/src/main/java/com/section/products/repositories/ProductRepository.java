package com.section.products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.section.products.models.Category;
import com.section.products.models.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {
	
	List<Product> findAll();
	List<Product> findByCategoriesNotContains(Category category);
	Category save(Category category);
}
