package com.section.products.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.section.products.models.Category;
import com.section.products.models.Product;
import com.section.products.service.ProCatService;

@Controller
public class StoreController {
	
	private final ProCatService proCatService;
	
	public StoreController ( ProCatService proCatService) {
		this.proCatService = proCatService;
	}
	
	@RequestMapping("/products/new")
	public String newProduct(@ModelAttribute("product") Product product ) {
		return "product.jsp";
	}
	
	@RequestMapping(value = "/product" , method = RequestMethod.POST )
	public String addProduct(@Valid @ModelAttribute("product") Product product , BindingResult result) {
		
		if(result.hasErrors()) {
			return "product.jsp";
		}
		Product product1 = proCatService.createProduct(product);
		return "redirect:/products/new";
	}


	@RequestMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category ) {
		return "category.jsp";
	}
	
	@RequestMapping(value = "/category" , method = RequestMethod.POST )
	public String addProduct(@Valid @ModelAttribute("category") Category category , BindingResult result) {
		
		if(result.hasErrors()) {
			return "category.jsp";
		}
		Category category1 = proCatService.createCategory(category);
		return "redirect:/category/new";
	}
	
	@RequestMapping("/products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id) {
		Product product1 = proCatService.findOneProduct(id);
		model.addAttribute("product",product1);
		List<Category> unlisted = proCatService.allCategoriesExcept(product1);
		model.addAttribute("unlisted",unlisted);
		return "showProduct.jsp";
	}
	@RequestMapping("/addCategory/{id}")
	public String addCategories(@PathVariable("id") Long pro_id, @RequestParam("category") Long cat_id) {
		proCatService.add(pro_id,cat_id);
		return"redirect:/products/"+pro_id;
		
	}
	
	@RequestMapping("/category/{id}")
	public String showCategory(Model model, @PathVariable("id") Long id) {
		Category category = proCatService.findOneCategory(id);
		model.addAttribute("category",category);
		List<Product> unlisted = proCatService.allProductsExcept(category);
		model.addAttribute("unlisted",unlisted);
		return "showCategory.jsp";
	}
	
	@RequestMapping("/addProduct/{id}")
	public String addProducts(@PathVariable("id") Long id, @RequestParam("product") Long idpro) {
		proCatService.addPro(id, idpro);
		return"redirect:/category/"+id;
		
	}


}
