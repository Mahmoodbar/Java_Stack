package com.section.products.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.section.products.models.Category;
import com.section.products.models.Product;
import com.section.products.repositories.CategoryRepository;
import com.section.products.repositories.ProductRepository;

@Service
public class ProCatService {

	private final CategoryRepository categoryRepository ;
	private final ProductRepository productRepository ;
	
	public ProCatService(CategoryRepository categoryRepository , ProductRepository productRepository) {
		this.categoryRepository = categoryRepository;
		this.productRepository =productRepository; 
	}
		public Product createProduct(Product product) {
			return productRepository.save(product);
	
		}
		public Category createCategory(Category category) {
			return categoryRepository.save(category);
		}
		
		public List<Product> findAllProducts() {
			return productRepository.findAll();
		}
		public List<Category> findAllCategory() {
			return categoryRepository.findAll();
		}
		
		public Product findOneProduct(Long id) {
			Optional<Product> product=productRepository.findById(id);
			if(product.isPresent()) {
				return product.get();
			}
			else { return null;
			}
		
		}
		public Category findOneCategory(Long id) {
			Optional<Category> category=categoryRepository.findById(id);
			if(category.isPresent()) {
				return category.get();
			}
			else { return null;
			}
		
		}
		
		public List<Category> allCategoriesExcept(Product prodcut){
			return categoryRepository.findByProductsNotContains(prodcut);
		}
		public List<Product> allProductsExcept(Category category){
			return productRepository.findByCategoriesNotContains(category);
		}
		 public Product add(Long pro_id,Long cat_id) {
		    	Product product = productRepository.findById(pro_id).orElse(null);
		    	Category category = categoryRepository.findById(cat_id).orElse(null);
		    	List<Category> cat = product.getCategories();
		    	 cat.add(category);
		    	 product.setCategories(cat);
		    	 return productRepository.save(product);
		    }
		    
		    public Category addPro(Long id,Long idpro) {
		    	Category category = categoryRepository.findById(id).orElse(null);
		    	Product product = productRepository.findById(idpro).orElse(null);
		    	List<Product> pro = category.getProducts();
		    	 pro.add(product);
		    	 category.setProducts(pro);
		    	 return productRepository.save(category);
		    }
			
}